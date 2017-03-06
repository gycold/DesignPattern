package com.easyandroid.designpatternlib.SinglePattern;

/**
 * package: com.easyandroid.designpatternlib.SinglePattern.SingletonClass
 * author: gyc
 * description:最完善的单例实现方式，且不受java版本影响
 * time: create at 2017/3/6 23:04
 */

public class SingletonClass {
    private static class SingletonClassInstance {
        private static final SingletonClass instance = new SingletonClass();
    }

    public static SingletonClass getInstance() {
        return SingletonClassInstance.instance;
    }

    private SingletonClass() {

    }
}
