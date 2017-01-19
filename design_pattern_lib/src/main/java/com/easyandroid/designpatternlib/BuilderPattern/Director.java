package com.easyandroid.designpatternlib.BuilderPattern;

/**
 * package: com.easyandroid.designpatternlib.BuilderPattern.Director
 * author: gyc
 * description:建造者/生成器模式--统一组装过程
 * time: create at 2017/1/19 13:52
 */

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(int partA, int partB) {
        builder.buildPartA(partA);
        builder.buildPartB(partB);
    }
}
