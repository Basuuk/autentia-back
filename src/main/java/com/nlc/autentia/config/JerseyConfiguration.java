package com.nlc.autentia.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.nlc.autentia.controller.CourseController;
import com.nlc.autentia.controller.TeacherController;
import com.nlc.autentia.filter.CorsFilter;

@Configuration
@ApplicationPath(value = "/autentia")
public class JerseyConfiguration extends ResourceConfig {

	public JerseyConfiguration() {
		register(TeacherController.class);
		register(CourseController.class);
		register(CorsFilter.class);
//		packages("com.nlc.autentia.controller");
	}

}
