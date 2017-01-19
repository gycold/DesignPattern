package com.easyandroid.designpatternlib.BuilderPattern;

/**
 * package: com.easyandroid.designpatternlib.BuilderPattern.ConcreteBuilder
 * author: gyc
 * description:建造者/生成器模式--具体的Builder类
 * time: create at 2017/1/19 13:51
 */

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA(int partA) {
        product.setPartA(partA);
    }

    @Override
    public void buildPartB(int partB) {
        product.setPartB(partB);
    }

    @Override
    public Product build() {
        return product;
    }
}
