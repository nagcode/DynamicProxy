package com.test.dynamicproxy;

public class Test {

	public static void main(String args[]) {
		Service service = ServiceFactory.getService();
		service.method1("test1", "test2");
		service.method1("test3", "test4");
	}
}
