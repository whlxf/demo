package com.test;


import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class personOption {


//
//    public void beforeLoadXML(){
//        //加载 mybatis 配置文件
//        InputStream inputStream = personOption.class.
//                getClassLoader().getResourceAsStream("mybatis-configuration.xml");
//        //构建sqlSession的工厂
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(inputStream);
//        //根据 sqlSessionFactory 产生 session
//        session = sqlSessionFactory.openSession();
//    }
    mybatisUtil my = new mybatisUtil();
    SqlSession session = mybatisUtil.getSqlSession();

    //根据 pid 查询 person 表中的数据

    public void testSelectById(){
        //这个字符串有 personMapper.xml 文件中 两个部分构成
        //<mapper namespace="com.ys.bean.personMapper"> 的 namespace 的值
        //<select id="selectPersonById" > id 值
        String statement = "com.test.personMapper"+".selectPersonById";
        personInfo p = session.selectOne(statement, 1);
        System.out.println(p);
        session.close();
    }

    //查询person 表所有数据

    public void testGetAllPerson(){
        String statement = "com.test.personMapper.getAllPerson";
        List<personInfo> listPerson = session.selectList(statement);
        System.out.println(listPerson);
        session.close();
    }

    //根据id更新数据

    public void updateById(){
        String statement = "com.test.personMapper.updatePersonById";
        personInfo p = new personInfo();
        p.setPid(1);
        p.setPname("aaa");
        p.setPage(11);
        session.update(statement, p);
        session.commit();
        session.close();
    }

    //向 person 表插入一条数据

    public void addPerson(){
        String statement = "com.test.personMapper.addPerson";
        personInfo p = new personInfo();
        //由于我们设置了主键的自增长机制，故这里不需要手动设置 pid 的值
        //p.setPid(1);
        p.setPname("add");
        p.setPage(11);
        session.insert(statement, p);
        session.commit();
        session.close();
    }

    //根据 pid 删除person 表中的数据

    public void deletePersonById(){
        String statement = "com.test.personMapper.deletePersonById";
        session.delete(statement, 1);
        session.commit();
        session.close();

    }
}