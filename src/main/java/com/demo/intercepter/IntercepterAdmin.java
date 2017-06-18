package com.demo.intercepter;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 跌幅级别的拦截器，之拦截 admin 的URL。
 * @author lu
 *
 */
public class IntercepterAdmin implements Interceptor {

	public void intercept(Invocation inv) {
		System.out.println("之拦截 admin 的URL。");
		inv.invoke();
	}

}
