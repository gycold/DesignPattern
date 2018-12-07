package com.easyandroid.designpatternlib.ObserverPattern;

/**
 * package: Subject
 * author: gyc
 * description:抽象被观察者（Subject）,抽象主题，提供了attach、detach、notify三个方法：
 * time: create at 2017/2/12 15:43
 */

public interface Subject {
    /**
     * 增加订阅者
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     */
    void notify(String message);
}
