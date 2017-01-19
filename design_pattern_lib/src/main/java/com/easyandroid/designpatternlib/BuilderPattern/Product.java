package com.easyandroid.designpatternlib.BuilderPattern;

/**
 * package: com.easyandroid.designpatternlib.BuilderPattern.Product
 * author: gyc
 * description:建造者/生成器模式--产品模块
 * time: create at 2017/1/19 13:48
 */

public class Product {

    public int partB;
    public int partA;

    public int getPartA() {
        return partA;
    }

    public void setPartA(int partA) {
        this.partA = partA;
    }

    public int getPartB() {
        return partB;
    }

    public void setPartB(int partB) {
        this.partB = partB;
    }

    @Override
    public String toString() {
        return "partA : " + partA + "   partB : " + partB;
    }
}
