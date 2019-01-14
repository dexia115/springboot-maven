package com.gaia.server;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class WebServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(WebServerApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

}
