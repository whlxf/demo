package com.test;

public class personInfo {
    private int pid;
    private String pname;
    private int page;

    public int getPid(){
        return pid;
    }
    public void setPid(int pid){
        this.pid = pid;
    }

    public String getPname(){
        return pname;
    }
    public void setPname(String pname){
        this.pname = pname;
    }

    public int getPage(){
        return page;
    }
    public void setPage(int page){
        this.page = page;
    }

    @Override
    public String toString(){
        return "person[pid=" + pid + ",pname=" + pname + ",page=" + page + "]";
    }

}
