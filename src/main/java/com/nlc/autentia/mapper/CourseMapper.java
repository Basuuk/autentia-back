package com.nlc.autentia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.nlc.autentia.entity.Course;

@Mapper
public interface CourseMapper {

	@Select("SELECT c.ID, c.TITULO, c.NIVEL, c.HORAS, c.ID_PROFESOR, c.ESTADO FROM CURSOS c WHERE c.ESTADO = #{state} ORDER BY c.TITULO ASC LIMIT #{offset}, #{limit}")
	public List<Course> getAll(@Param("offset") Integer offset, @Param("limit") Integer limit, @Param("state") Boolean state);

	@Insert("INSERT INTO CURSOS(TITULO, NIVEL, HORAS, ID_PROFESOR, ESTADO) VALUES(#{titulo}, #{nivel}, #{horas}, #{id_profesor}, #{estado})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="ID")
    public int insert(Course course);

}
