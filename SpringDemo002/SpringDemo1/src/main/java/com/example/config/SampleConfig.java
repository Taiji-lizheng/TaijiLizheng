package com.example.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.bean.ExampleBean;
import com.example.bean.XmlBean;

@Configuration
@ComponentScan(basePackages="com.example")
public class SampleConfig {

	
		@Bean
		public ExampleBean exampleBean() {
			ExampleBean exampleBean= new ExampleBean();
			exampleBean.setSchool("buu");
			exampleBean.setSnum(123);
			exampleBean.setXb(xmlBean());
			return exampleBean;
		}
	
		@Bean
		public XmlBean xmlBean() {
			XmlBean xmlBean = new XmlBean();
			xmlBean.setPname("老王");
			xmlBean.setAge(31);
			return xmlBean;
		}
		/*@Bean(destroyMethod = "close")
		DataSource dataSource() {
			BasicDataSource ds = new BasicDataSource();
			ds.setDriverClassName("com.mysql.jdbc.Driver");
			ds.setUsername("app");
			ds.setPassword("app");
			ds.setUrl("jdbc:mysql://localhost:3306/app?useUnicode=true&characterEncoding=utf-8");
			return ds;
		}*/
}
