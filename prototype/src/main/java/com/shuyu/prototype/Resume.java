package com.shuyu.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.prototype
 * @description:原型类,实现Cloneable，重写clone(),实现浅复制
 * @date 2018-11-16 23:05
 **/
@Slf4j
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;
    public Resume(String name){
        this.name=name;
    }

    public void setPersonInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }

    public void setWorkExperience(String workDate,String company){
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void show(){
        log.info("name="+name,",sex="+sex,",age="+age);
        log.info("company="+workExperience.getCompany(),"workDate="+workExperience.getWorkDate());
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
