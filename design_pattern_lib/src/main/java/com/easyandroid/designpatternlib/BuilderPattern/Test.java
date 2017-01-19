package com.easyandroid.designpatternlib.BuilderPattern;

import android.util.Log;

/**
 * package: com.easyandroid.designpatternlib.BuilderPattern.Test
 * author: gyc
 * description:建造者模式的测试类
 * time: create at 2017/1/19 13:52
 */

public class Test {

    public static void main(String args[]){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct(1, 2);
        Product product = builder.build();
        Log.e("shawn", product.toString());
    }

    //运行结果：
    //com.android.builderpattern E/shawn: partA : 1   partB : 2
}
