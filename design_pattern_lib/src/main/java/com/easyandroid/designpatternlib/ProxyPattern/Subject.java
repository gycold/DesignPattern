package com.easyandroid.designpatternlib.ProxyPattern;

/**
 * package: com.easyandroid.designpatternlib.ProxyPattern.Subject
 * author: gyc
 * description:抽象角色，声明真实对象和代理对象的共同接口,这样可在任何使用真实对象的地方都可以使用代理对象。
 * time: create at 2018/12/7 14:00
 */
public interface Subject {
    void doSomething();
}
