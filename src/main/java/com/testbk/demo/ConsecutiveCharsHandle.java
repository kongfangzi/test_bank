package com.testbk.demo;

/**
 * @author Liu Feng
 * @version 1.0
 * @packageName com.testbk.demo
 * @className ConsecutiveCharsHandle
 * @date 2024/4/19 3:00
 * @description 判断3个相同字符
 */
public class ConsecutiveCharsHandle extends AbstractChars {

    @Override
    public boolean haveConsecutiveChars(String s, int count) {
        for (int i = 0; i < s.length() - count + 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)
                    && s.charAt(i) == s.charAt(i + 3 - 1)) {
                return true;
            }
        }
        return false;
    }
}
