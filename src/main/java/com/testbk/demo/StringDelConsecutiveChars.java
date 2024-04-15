package com.testbk.demo;

/**
 * @author Liu Feng
 * @version 1.0
 * @packageName PACKAGE_NAME
 * @className StringDelConsecutiveChars
 * @date 2024/4/11 20:16
 * @description 字符串去除连续相同字符
 */
public class StringDelConsecutiveChars {
    public static String removeConsecutiveChars(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count < 3) {
                    sb.append(s.substring(i - count, i));
                }
                count = 1;
            }
        }

        // 处理字符串末尾的字符
        if (count < 3) {
            sb.append(s.substring(s.length() - count));
        }

        String result = sb.toString();

        System.out.println(result); // 输出: "abcde" 或其他不超过3个连续相同字符的字符串

        // 如果结果字符串中仍然有3个或更多连续字符，则递归调用此方法
        if (haveConsecutiveChars(result, 3)) {
            return removeConsecutiveChars(result);
        }

        return result;
    }

    private static boolean haveConsecutiveChars(String s, int count) {
        for (int i = 0; i < s.length() - count + 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)
                    && s.charAt(i) == s.charAt(i + 3 - 1)) {
                return true;
            }
        }
        return false;
    }

}
