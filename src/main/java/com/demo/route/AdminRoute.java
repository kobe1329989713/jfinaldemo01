package com.demo.route;

import com.demo.controller.IndexController;
import com.demo.intercepter.IntercepterAdmin;
import com.jfinal.config.Routes;

/**
 *  
 *
 */
public class AdminRoute extends Routes {

	@Override
	public void config() {
		setBaseViewPath("/WEB-INF");
		addInterceptor(new IntercepterAdmin());
		add("/admin",IndexController.class);
	}

}
