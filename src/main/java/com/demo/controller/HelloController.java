package com.demo.controller;

import com.demo.common.Blog;
import com.jfinal.core.Controller;
/**
 * Jfinal 的Controller 类，
 * Controller 下面是很多 Action，每个Action就是
 * 一个请求。
 * 
 * 1、每个什么 XxxController 类必须要继承 Controller 类
 * 
 * 这个Controller类写完
 * 	写 Action。
 * ，在就配置好路由就行
 * 在如何从 页面接收参数
 * 如何返回参数。
 *
 */
public class HelloController extends Controller {
	
	/**
	 * Action 注意点：
	 * 	1、每个Action 访问修饰符必须是 public
	 * 	2、必须是无返回Void的。
	 * 	3、每个Action方法必须是无参的。
	 */
	public void index(){
		
		/**
		 * getPara("key","default value")
		 * 	就像是 request.getParamiter() 哪个方法样：
		 *
		 * 	getPara() 有很多重载方法。
         *
		 */
		
		// 接收参数， 只要收到参数了，这个默认就会被干掉。
		String msg = getPara("msg","接收参数，"); // 注这里面给的是 默认参数
		// 返回参数
		setAttr("msg", "返回参数是：：" + msg);
		// 用于接收 checkbox 值。
		String[] strs = getParaValues("test");


		// getMOdel() 用它必须要配置数据库才行。和 javaBean 映射，就是数据库相关的必须要配置好了才行。
        getModel(Blog.class);


		render("index.html");
	}

	// 访问它要，路由哪里类点add() 这个方法。
	public void add(){
		renderText("ssssssss");
	}

}
