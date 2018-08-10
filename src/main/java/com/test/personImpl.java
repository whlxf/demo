package com.test;

import org.apache.ibatis.session.SqlSession;


public class personImpl implements personMapper{

//    public personInfo getAllperson(){
//        SqlSession session = mybatisUtil.getSqlSession(true);
//        try{
//            personMapper msg = session.getMapper(personMapper.class);
//            return msg.getPerson(1);
//        }finally {
//            session.close();
//        }
//

    SqlSession session = mybatisUtil.getSqlSession(true);

    public int add(personInfo person){
        return session.getMapper(personMapper.class).add(person);

    }

    public int deletePerson(int pid){
        //SqlSession session = mybatisUtil.getSqlSession(true);
        return session.getMapper(personMapper.class).deletePerson(1);
    }

    public personInfo getPerson(int pid){
        return session.getMapper(personMapper.class).getPerson(1);
    }

    public int updatePerson(personInfo preson){
        return session.getMapper(personMapper.class).updatePerson(preson);
    }
}
