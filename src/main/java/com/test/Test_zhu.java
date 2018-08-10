package com.test;

import org.apache.ibatis.session.SqlSession;

public class Test_zhu {
    SqlSession session;
    public void testAnnocation(){
        personMapper mapper = session.getMapper(personMapper.class);
        personInfo p = new personInfo();
        p.setPid(7);
        p.setPname("abc");
        p.setPage(11);
        //调用增加方法
        mapper.add(p);
        //调用查询方法
        personInfo p1 = mapper.getPerson(3);
        System.out.println(p1);
        //调用更新方法
        p.setPage(100);
        mapper.updatePerson(p);
        //调用删除方法
        mapper.deletePerson(7);
        session.commit();
        session.close();
    }

    public static void main(String args[]){
        Test_zhu p = new Test_zhu();
        p.testAnnocation();

    }
}
