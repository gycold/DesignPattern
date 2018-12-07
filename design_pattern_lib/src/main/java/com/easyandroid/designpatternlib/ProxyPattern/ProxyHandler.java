package com.easyandroid.designpatternlib.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * package: com.easyandroid.designpatternlib.ProxyPattern.ProxyHandler
 * author: gyc
 * description:JDK动态代理，使用常规的代理，有以下通病：
 * 如果将来需要实现一个新的接口，就需要在代理类里再写该接口的实现方法，对导致代理类的代码变得臃肿；
 * 另一方面，当需要改变抽象角色接口时，无疑真实角色和代理角色也需要改变。
 * 使用JDK动态代理可以解决上面的问题
 * time: create at 2018/12/7 14:06
 */
public class ProxyHandler implements InvocationHandler {

    private Object tar;

    //绑定委托对象，并返回代理类
    public Object bind(Object tar) {
        this.tar = tar;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;//被代理的类型为Object基类
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        result = method.invoke(tar, args);
        return result;
    }


}
