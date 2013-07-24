package com.test.dynamicproxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Proxy implements java.lang.reflect.InvocationHandler {
	private Service realService;
	private Proxy(Service implObj) {
	this.realService = implObj;
}

public static Service getProxyService(Service service) {
	Class serviceClass = service.getClass();
	Proxy proxy = new Proxy(service);
	return (Service) java.lang.reflect.Proxy.newProxyInstance(serviceClass.getClassLoader(), serviceClass.getInterfaces(), proxy);
}

public Object invoke(final Object proxy, final Method m, final Object[] args) throws Throwable{
	String methodName = m.getName();
	//Do input logging
	System.out.println("Executing method = ["+ methodName +"], args = ["+Arrays.toString(args) +"]");
	//Execute the actual method
	Object result = m.invoke(realService, args);	
//Do output logging
	System.out.println("Executed method = ["+ methodName +"], Output = ["+ ( (result == null) ? "": result.toString()) +"]");
	return result;
}
}
