package com.easyandroid.designpattern.ObserverPattern;

/**
 * package: com.easyandroid.designpattern.ObserverPattern.ConcreteObserver
 * author: gyc
 * description:具体观察者（ConcrereObserver）,微信用户(ConcreteObserver)是观察者，里面实现了更新的方法：
 * time: create at 2017/2/12 15:41
 */

public class ConcreteObserver implements Observer {

    // 微信用户名
    private String name;
    public ConcreteObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }

}
