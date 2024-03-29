package com.nlc.autentia.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nlc.autentia.service.TeacherService;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService service;

	@GET
	public Response getAll(@QueryParam("offset") Integer offset, @QueryParam("limit") Integer limit) {
		return Response.status(200)
				.entity(service.getAll(offset, limit))
				.build();
	}

}
