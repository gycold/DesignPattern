package com.easyandroid.designpatternlib.ObserverPattern;

/**
 * package: Client
 * author: gyc
 * description:客户端调用示例：
 * time: create at 2017/2/12 15:45
 */

public class Client {
    public static void main(String[] args) {
        ConcreteSubject mSubscriptionSubject=new ConcreteSubject();
        //创建微信用户
        ConcreteObserver user1=new ConcreteObserver("杨影枫");
        ConcreteObserver user2=new ConcreteObserver("月眉儿");
        ConcreteObserver user3=new ConcreteObserver("紫轩");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("刘望舒的专栏更新了");
    }
}
