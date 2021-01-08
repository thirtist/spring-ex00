package org.zerock.persistence;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		//내컴퓨터 로컬용
		//String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//String user = "c##mydbms";
		//String password = "admin";
		
		//오라클 클라우드용
		String url = "jdbc:oracle:thin:@db202101040921_high?TNS_ADMIN=/home/opc/wallet";
		String user = "admin";
		String password = "12345qwert!Q";
		
		try(
			Connection con
			= DriverManager.getConnection(url, user, password);
				) {
			assertNotNull(con);
		} catch (Exception e) {
			fail(e.getMessage());
			log.info(e);
		}
		
	}

}
