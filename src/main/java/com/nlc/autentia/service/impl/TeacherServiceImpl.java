package com.nlc.autentia.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlc.autentia.entity.Teacher;
import com.nlc.autentia.mapper.TeacherMapper;
import com.nlc.autentia.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherMapper mapper;

	@Override
	public List<Teacher> getAll(Integer offset, Integer limit) {
		RowBounds rb = new RowBounds(offset, limit);
		return mapper.getAll(rb);
	}

}
