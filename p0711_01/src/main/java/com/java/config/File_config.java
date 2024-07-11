package com.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class File_config implements WebMvcConfigurer {
	//addResourceHandlers 자동완성 안되네;;
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//"/upload/**"업로드라고 되어있으면
		registry.addResourceHandler("/upload/**")
		//"file:///c:/upload/" 여기서 가져와?
		.addResourceLocations("file:///c:/upload/");
		
		
	}
}
