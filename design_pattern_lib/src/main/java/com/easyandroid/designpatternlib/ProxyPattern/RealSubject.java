package com.easyandroid.designpatternlib.ProxyPattern;

/**
 * package: com.easyandroid.designpatternlib.ProxyPattern.RealSubject
 * author: gyc
 * description:真实角色，即为代理对象所代表的目标对象，代理角色所代表的真实对象，是最终要引用的对象。
 * time: create at 2018/12/7 14:01
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("call doSomething()");
    }
}
