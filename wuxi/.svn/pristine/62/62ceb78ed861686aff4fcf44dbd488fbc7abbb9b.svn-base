package com.wuxi.control;



import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.activerecord.dialect.OracleDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;


public class JfinalControl extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
		//me.setViewType(ViewType.FREE_MARKER);
		
	}

	@Override
	public void configHandler(Handlers arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins me) {
		
		//jdbc:mysql://localhost:3306/gateface?useUnicode=true&characterEncoding=UTF-8
		/*
		C3p0Plugin c3p0Plugin_bssbeifeng = new C3p0Plugin(
				"jdbc:mysql://132.228.187.223:3306/competition?useUnicode=true&characterEncoding=UTF-8", 
				"competition","competition@123", "com.mysql.jdbc.Driver");
		ActiveRecordPlugin arp_bss = new ActiveRecordPlugin("duty",c3p0Plugin_bssbeifeng);
		me.add(c3p0Plugin_bssbeifeng);
		me.add(arp_bss);
		arp_bss.setDialect(new OracleDialect());
		arp_bss.setContainerFactory(new CaseInsensitiveContainerFactory());
		arp_bss.setTransactionLevel(8);
		arp_bss.setShowSql(true);
		*/
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/hello", RouteController.class);

	}

}
