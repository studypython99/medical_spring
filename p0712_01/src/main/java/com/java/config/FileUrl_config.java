package com.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration 
public class FileUrl_config {
	
	// 이미지나 동영상 / 파일업로드 관련해서 다른폴더를 연결할 때 설정한다.
	//addResourceHandlers 자동완성 안되네;;
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//"/upload/**"업로드라고 되어있으면
		registry.addResourceHandler("/upload/**")
		//"file:///c:/upload/" 여기서 가져와?
		.addResourceLocations("file:///c:/upload/");
		
		registry.addResourceHandler("/uploadImages/**")
		.addResourceLocations("file:///c:/images/");
		
		
	}
}
