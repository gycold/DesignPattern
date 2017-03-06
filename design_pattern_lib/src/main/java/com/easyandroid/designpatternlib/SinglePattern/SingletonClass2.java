package com.easyandroid.designpatternlib.SinglePattern;

/**
 * package: com.easyandroid.designpatternlib.SinglePattern.SingletonClass2
 * author: gyc
 * description:synchronized修饰的同步块可是要比一般的代码慢上几倍的,所以先做第一层判断，过滤掉不必要的同步
 * 此种单例实现方式依然存在不够严谨的问题：来考虑这么一种情况：线程A开始创建SingletonClass的实例，此时线程B调用了getInstance()
 * 方法，首先判断instance是否为null。按照我们上面所说的内存模型，A已经把instance指向了那块内存，只是还没有调用构造方法，因此B检测到instance不为null
 * ，于是直接把instance返回了——问题出现了，尽管instance不为null，但它并没有构造完成，就像一套房子已经给了你钥匙，但你并不能住进去，因为里面还没有收拾。此时，如果B在A
 * 将instance构造完成之前就是用了这个实例，程序就会出现错误了！
 * time: create at 2017/3/6 23:07
 */

public class SingletonClass2 {

    private static SingletonClass2 instance = null;

    public static SingletonClass2 getInstance() {
        if (instance == null) {
            synchronized (SingletonClass2.class) {
                if (instance == null) {
                    instance = new SingletonClass2();
                }
            }
        }
        return instance;
    }

    private SingletonClass2() {

    }
}
