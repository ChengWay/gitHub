package com.wuxi.dao;

import java.util.Iterator;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;
import com.wuxi.dao.DBdao;


public class DBdao  {
	
	public static final DBdao dao = new DBdao();
	public String search(){
		Iterator<Record> it=Db.use("duty").find("select count(*) ti from t_customer_b").iterator();
		Record record_temp=null;
		String currentdbdate="没有获取到";
		while(it.hasNext()){
			record_temp=it.next();
			currentdbdate=record_temp.getNumber("ti").toString();
		}
		return currentdbdate;
		
	}
	
}
