package com.test.dynamicproxy;

public class ServiceFactory {

	public static Service getService() {
		Service service = new ServiceImpl();
		return Proxy.getProxyService(service);
	}

}
