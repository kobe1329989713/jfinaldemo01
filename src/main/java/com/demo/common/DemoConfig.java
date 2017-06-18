package com.demo.common;

import com.demo.route.AdminRoute;
import com.demo.route.FrontRoute;
import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig {

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 8081, "/", 5);
    }

    @Override
    public void configConstant(Constants me) {
        PropKit.use("a_little_config.txt");
        //me.setDevMode(true);
        me.setDevMode(PropKit.getBoolean("devMode", false));
    }

    @Override
    public void configRoute(Routes me) {

//		me.add("/", IndexController.class);
//		me.add("/hello01", HelloController.class,"blog");


        // 路由分包。+ 路由级别拦截器
        me.add(new FrontRoute());
        me.add(new AdminRoute());
    }

    @Override
    public void configEngine(Engine me) {
        // TODO Auto-generated method stub

    }

    @Override
    public void configPlugin(Plugins me) {
        // 配置C3p0数据库连接池插件
        DruidPlugin druidPlugin = new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
        me.add(druidPlugin);

        // 配置ActiveRecord插件
        ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
        // 所有映射在 MappingKit 中自动化搞定
        //_MappingKit.mapping(arp);
        arp.addMapping("blog", Blog.class);
        me.add(arp);
    }

    @Override
    public void configInterceptor(Interceptors me) {
        // TODO Auto-generated method stub

    }

    @Override
    public void configHandler(Handlers me) {
        // TODO Auto-generated method stub

    }

}
