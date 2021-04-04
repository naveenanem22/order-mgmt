package com.techietipps.ordermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Properties;

@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServletInitializer.class).properties(getProperties());
	}

	public static void main(String[] args) {
		SpringApplication.run(ServletInitializer.class, args);
	}

	static Properties getProperties() {
		Properties props = new Properties();
		props.put("spring.config.location","file:///D:/Softwares/apache-tomcat-9.0.44-windows-x64/apache-tomcat-9.0.44/conf/application.properties");
		return props;

	}

}
