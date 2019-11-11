package com.nlc.autentia.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nlc.autentia.entity.Course;
import com.nlc.autentia.service.CourseService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/course")
public class CourseController {

	@Autowired
	private CourseService service;

	@GET
	public Response getAll(@QueryParam("offset") Integer offset, @QueryParam("limit") Integer limit) {
		return Response.status(200)
				.entity(service.getAll(offset, limit))
				.build();
	}

	@POST
	public Course create(Course course) {
		return service.create(course);
	}

}
