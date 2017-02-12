package com.easyandroid.designpatternlib.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * package: ConcreteSubject
 * author: gyc
 * description:具体被观察者（ConcreteSubject）,
 * 微信公众号是具体主题（具体被观察者），
 * 里面存储了订阅该公众号的微信用户，并实现了抽象主题中的方法：
 * time: create at 2017/2/12 15:44
 */

public class ConcreteSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
