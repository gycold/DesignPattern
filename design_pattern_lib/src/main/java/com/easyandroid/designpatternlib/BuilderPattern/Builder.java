package com.easyandroid.designpatternlib.BuilderPattern;

/**
 * package: com.easyandroid.designpatternlib.BuilderPattern.Builder
 * author: gyc
 * description:建造者/生成器模式--接口或抽象类
 * time: create at 2017/1/19 13:50
 */

public abstract class Builder {
    public abstract void buildPartA(int partA);

    public abstract void buildPartB(int partB);

    public abstract Product build();
}
