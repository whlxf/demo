package com.test;

public interface personApi {

    public int add(personInfo person);
    public personInfo getPerson(int pid);
    public int updatePerson(personInfo preson);
    public int deletePerson(int pid);

}
