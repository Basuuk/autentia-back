package com.nlc.autentia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import com.nlc.autentia.entity.Teacher;

@Mapper
public interface TeacherMapper {

	@Select("SELECT t.ID, t.NOMBRE FROM PROFESORES t LIMIT #{param1.offset}, #{param1.limit}")
    public List<Teacher> getAll(RowBounds rb);

}
