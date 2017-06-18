package com.demo.intercepter;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 跌幅级别的拦截器，之拦截前端的URL。
 * @author lu
 *
 */
public class IntercepterFront implements Interceptor {

	public void intercept(Invocation inv) {
		System.out.println("之拦截前端的URL。");
		// 注：这个方法千万不要搞忘记了。
		inv.invoke();
	}

}
