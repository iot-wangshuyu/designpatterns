package com.shuyu.prototype2;

import com.shuyu.prototype.WorkExperience;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.prototype
 * @description:原型类,实现Cloneable，重写clone(),实现深复制
 * @date 2018-11-16 23:05
 **/
@Slf4j
public class Resume2 implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience2 workExperience;
    public Resume2(String name){
        this.name=name;
        workExperience=new WorkExperience2();
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
        Resume2 clone = null;
        try {
            clone = (Resume2)super.clone();
            clone.workExperience=(WorkExperience2) workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
