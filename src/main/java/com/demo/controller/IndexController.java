package com.demo.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index(){
		setAttr("msg", "可以热部署嘛。返回页面值==");
		renderTemplate("index.html");
	}
	
	public void index2(){
//		renderText("九，来个难写的字。");

		renderTemplate("index.html");
	}
	
//	@ActionKey("/logg22") // 是代替整个IndexConroller 吗？好像就不用配置哪个路由了。
	public void ind3(){
		renderText("九，来个难写的字。");
//		renderTemplate("index.html");
	}
	
	
	
}
