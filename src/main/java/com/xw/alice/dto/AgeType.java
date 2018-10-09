package com.xw.alice.dto;

/**
 * Created by xuw-e on 2018/10/9.
 */
public enum AgeType {
    Young, Old;

    public static AgeType getType(Integer age) {
        if (age < 30) {
            return AgeType.Young;
        }
        return AgeType.Old;
    }
}
