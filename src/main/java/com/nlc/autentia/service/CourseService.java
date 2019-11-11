package com.nlc.autentia.service;

import java.util.List;

import com.nlc.autentia.entity.Course;

public interface CourseService {

	List<Course> getAll(Integer offset, Integer limit);

	Course create(Course course);
}
