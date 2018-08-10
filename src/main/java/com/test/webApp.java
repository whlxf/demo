package com.test;

import org.apache.ibatis.session.SqlSession;

public class webApp {
    public static void main(String args[]){

        SqlSession session = mybatisUtil.getSqlSession();
        personMapper mapper = session.getMapper(personMapper.class);
        personInfo pinfo = new personInfo();
        pinfo.setPid(1);
        pinfo.setPname("test007");
        pinfo.setPage(11);

        mapper.add(pinfo);

    }


}
