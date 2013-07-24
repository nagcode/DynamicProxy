package com.test.dynamicproxy;

public class ServiceImpl implements Service {

	public String method1(String x, String y) {
		return x+y+"method1";
	}

	public String method2(String x, String y) {
		return x+y+"method2";
	}

}
