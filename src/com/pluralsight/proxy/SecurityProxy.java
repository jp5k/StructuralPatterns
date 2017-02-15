package com.pluralsight.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

	private Object obj;

	// Small factory, to grab an instance of this oject back (used in the
	// newInstance method)
	private SecurityProxy(Object obj) {
		this.obj = obj;
	}

	// This class implements the InvocationHandler
	// This class is the security proxy that sits between the TwitterService and
	// the TwitterServiceStub

	public static Object newInstance(Object obj) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass()
				.getClassLoader(), obj.getClass().getInterfaces(),
				new SecurityProxy(obj));

	}

	// This is the method we have to implement from the InvocationHandler
	// Interface
	// States the methods which we are going to call on our proxy
	@Override
	public Object invoke(Object proxy, Method m, Object[] args)
			throws Throwable {
		Object result;
		try {
			// This determines the methods that are invoked
			// Can add our security here!!!!
			// Like AOP programming, without all the headaches. Here just using the naming convention 
			// of the method within the class (e.g. method contains post).
			if (m.getName().contains("post")) {
				throw new IllegalAccessException("Posts are currently not allowed");
			} else {
				result = m.invoke(obj, args);
			}
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("Unexpected invocation exception:"
					+ e.getMessage());
		}

		return result;
	}
}
