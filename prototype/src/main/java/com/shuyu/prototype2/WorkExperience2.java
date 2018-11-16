package com.shuyu.prototype2;

import lombok.Data;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.prototype
 * @description:
 * @date 2018-11-16 23:11
 **/
@Data
public class WorkExperience2 implements Cloneable{
    private String workDate;
    private String company;

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
