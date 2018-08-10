package com.test;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface personMapper {

    @Insert("insert into person(pid,pname,page) values(#{pid},#{pname},#{page})")
    public int add(personInfo person);

    @Select("select * from person where pid = #{pid}")
    public personInfo getPerson(int pid);

    @Update("update person set pname=#{pname},page=#{page} where pid = #{pid}")
    public int updatePerson(personInfo preson);

    @Delete("delete from person where pid=#{pid}")
    public int deletePerson(int pid);
}


