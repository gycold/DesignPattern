package com.easyandroid.designpatternlib.SinglePattern;

/**
 * package: com.easyandroid.designpatternlib.SinglePattern.SingletonClass1
 * author: gyc
 * description:适用于JDk5.0之后的版本
 * time: create at 2017/3/6 23:05
 */

public class SingletonClass1 {

    private volatile static SingletonClass1 instance = null;

    public static SingletonClass1 getInstance() {
        if (instance == null) {
            synchronized (SingletonClass1.class) {
                if(instance == null) {
                    instance = new SingletonClass1();
                }
            }
        }
        return instance;
    }

    private SingletonClass1() {

    }
}
