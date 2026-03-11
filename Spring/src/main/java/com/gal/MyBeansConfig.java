package com.gal;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeansConfig {
//	will create beans and then provide to spring context, then onward context will manage item

	@Bean
	@Scope("prototype")
//	@Scope("request")
//	@Scope("session")
//	@Scope("application")
	StringBuilder getStringBuilder() {
		System.out.println("retruning new StringBuilder");
		return new StringBuilder("bean from configuration");

	}

	@Bean
	@Primary
	Calc getCalc() {
		return new Mycalc();
	}

	@Bean(name = "calcNameBean")
	Calc getCalc2() {
		return new Mycalc();
	}
	@Bean
	DataSource getDataSource() {
		return new DataSource() {
			
			@Override
			public <T> T unwrap(Class<T> iface) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Logger getParentLogger() throws SQLFeatureNotSupportedException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void setLoginTimeout(int seconds) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLogWriter(PrintWriter out) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int getLoginTimeout() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public PrintWriter getLogWriter() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Connection getConnection(String username, String password) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Connection getConnection() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
