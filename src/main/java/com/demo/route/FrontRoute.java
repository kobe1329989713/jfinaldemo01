package com.demo.route;

import com.demo.controller.HelloController;
import com.demo.controller.IndexController;
import com.jfinal.config.Routes;

/**
 * 
 * 前端路由，只负责跳转前端的页面。
 */
public class FrontRoute extends Routes {

	@Override
	public void config() {
		// 注：main 哪里开始的。
//		setBaseViewPath("/front");
		// 就是加，路由级别拦截器intercepter，只要配置到这个里面的URL 这个拦截器都会拦截的。
//		addInterceptor(new IntercepterFront());
		add("/", IndexController.class);
		// 它是如何访问 它里面的Action的 HelloController.Action（）
		// 它默认访问的是 index() 方法。
		// 它是在哪个里面找路径，它的路径是如何的？？？
		add("/hello01", HelloController.class, "/blog");
 
	}

}
