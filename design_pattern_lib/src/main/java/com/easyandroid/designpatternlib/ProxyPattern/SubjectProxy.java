package com.easyandroid.designpatternlib.ProxyPattern;

/**
 * package: com.easyandroid.designpatternlib.ProxyPattern.SubjectProxy
 * author: gyc
 * description:
 * 代理角色，代理对象内部含有真实对象的引用，从而可以在任何时候操作真实对象。
 * 代理对象提供一个与真实对象相同的接口，以便可以在任何时候替代真实对象。
 * 代理对象通常在客户端调用传递给真实对象之前或之后，执行某个操作，而不是单纯地将调用传递给真实对象，
 * 同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。
 * time: create at 2018/12/7 14:03
 */
public class SubjectProxy implements Subject {

    //代理模式的作用是：为其他对象提供一种代理以控制对这个对象的访问。
    Subject subimpl = new RealSubject();

    @Override
    public void doSomething() {
        System.out.println("before"); //调用目标对象之前可以做相关操作
        subimpl.doSomething();
        System.out.println("after");//调用目标对象之后可以做相关操作
    }
}
