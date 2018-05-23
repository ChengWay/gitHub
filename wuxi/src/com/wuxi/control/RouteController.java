package com.wuxi.control;



import com.wuxi.dao.DBdao;
import com.wuxi.db.SqlMapFactory;

import net.sf.json.JSONObject;

import java.sql.SQLException;

import com.jfinal.core.Controller;


public class RouteController extends Controller {

	public void index() {
		//JSONObject partities=new JSONObject();
		
		try {
			String num = (String) SqlMapFactory.getSqlMap().queryForObject("getNum");
			//partities.put("code", "SUCCESS");
			//partities.put("num", num);
			//renderJson(partities.toString());
			this.setAttr("num", num);
		} catch (SQLException e) {
			//partities.put("code", "FAILED");
			//partities.put("num", "");
			this.setAttr("num", "");
			e.printStackTrace();
		}
		
		//this.renderJsp("/page/hellow.jsp");
		this.render("/page/graph_echarts.html");
	}
}
