package com.nlc.autentia.service;

import java.util.List;

import com.nlc.autentia.entity.Teacher;

public interface TeacherService {

	List<Teacher> getAll(Integer offset, Integer limit);

}
