package com.testbk.demo;

/**
 * @author Liu Feng
 * @version 1.0
 * @packageName com.testbk.demo
 * @className AbstractChars
 * @date 2024/4/19 2:57
 * @description 抽象类，定义模板方法和基本方法（模板方法模式）
 */
public abstract class AbstractChars {

    //模板方法: 算法的骨架，按某种顺序调用其包含的基本方法
    public final boolean handleChars(String s, int count) {
        // 有3个重复字符
        return haveConsecutiveChars(s, count);
    }
    //有3个重复字符
    public abstract boolean haveConsecutiveChars(String s, int count);//抽象方法
}
