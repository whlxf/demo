package com.test;

/*mybatis工具类：获取SqlSessionFactory 和 SqlSession */
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class mybatisUtil {

    /*获取SqlSessionFactory*/
    public static SqlSessionFactory getSqlSessionFactory(){
        String resource = "mybatis-configuration.xml";
        InputStream is = mybatisUtil.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        return factory;
    }

    /*获取SqlSession*/
    public static SqlSession getSqlSession(){
        return getSqlSessionFactory().openSession();
    }

    /*获取SqlSession
    * isAutoCommit = true 表示创建的sqlSession对象在执行完SQL之后自动提交事务
    * =false 表示创建的SqlSession对象在执行完SQL之后不会自动提交，需要手动调用 sqlsession.commit()提交事务*/
    public static SqlSession getSqlSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
