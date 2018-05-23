package com.wuxi.db;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapFactory {
	private static SqlMapClient sqlMap = null;

	static {
		try {
			Resources.setCharset(Charset.forName("utf-8"));
			Reader reader = Resources.getResourceAsReader("config/SqlMapConfigOfWX.xml");
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static SqlMapClient getSqlMap() {
		return sqlMap;
	}

}
