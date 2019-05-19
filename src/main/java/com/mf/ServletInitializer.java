package com.mf;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * 若打包成war包,则需要继承 org.springframework.boot.context.web.SpringBootServletInitializer类,覆盖其config(SpringApplicationBuilder)方法
 * @author User
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JxcApplication.class);
	}

	
	
	
}
