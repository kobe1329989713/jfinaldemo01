package com.demo.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class UserController extends Controller {
	/**
	 * 就是用了这个注解，就可以不用在配置路由了
	 */
	@ActionKey("/log22")
	public void log(){
		// 从main哪里开始，指定它在哪个目录下面。
		// 设置拦截器
		renderTemplate("index.html");
	}
	// 注：还有有从URL 获取参数的问题。看文档。
	
	
}
