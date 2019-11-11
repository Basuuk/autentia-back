package com.nlc.autentia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlc.autentia.entity.Course;
import com.nlc.autentia.mapper.CourseMapper;
import com.nlc.autentia.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper mapper;

	@Override
	public List<Course> getAll(Integer offset, Integer limit) {
		return mapper.getAll(offset, limit, true);
	}

	@Override
    public Course create(Course course) {
        int a = mapper.insert(course);
        System.out.println(a);
        return course;
    }

}
