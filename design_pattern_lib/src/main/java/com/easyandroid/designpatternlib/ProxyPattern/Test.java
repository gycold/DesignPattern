package com.easyandroid.designpatternlib.ProxyPattern;

/**
 * package: com.easyandroid.designpatternlib.ProxyPattern.Test
 * author: gyc
 * description:代理模式测试
 * time: create at 2018/12/7 14:04
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //常规代理
//        Subject sub = new SubjectProxy();
//        sub.doSomething();
        //JDK动态代理
        ProxyHandler proxy = new ProxyHandler();
        //绑定该类实现的所有接口
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.doSomething();
    }
}
