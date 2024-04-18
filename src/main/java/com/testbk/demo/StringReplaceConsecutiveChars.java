package com.testbk.demo;

/**
 * @author Liu Feng
 * @version 1.0
 * @packageName PACKAGE_NAME
 * @className StringDelConsecutiveChars
 * @date 2024/4/11 19:36
 * @description 字符串替换连续字符
 */
public class StringReplaceConsecutiveChars {

    public static void replaceConsecutiveChars(String s) {
        StringBuilder sb = new StringBuilder();
        String replacedString = "";//被替换的字符串
        char replaceChar = 0;//替换字符
        for (int i = 0; i < s.length(); ) {
            char ch = s.charAt(i);
            int count = 1;
            // 统计连续字符的个数
            while (i + 1 < s.length() && s.charAt(i + 1) == ch) {
                count++;
                i++;
            }
            if (count >= 3) {
                char prevChar = (char) (ch - 1);
                for (int t = 0; t < count; t++) {
                    replacedString += ch;
                }
                replaceChar = prevChar;
                if (prevChar >= 'a') {
                    sb.append(prevChar);
                    ; // 如果当前字符是'a'之后的字母，才替换
                }
            } else {
                // 否则，直接添加字符
                sb.append(s.substring(i, i + count));
            }
            i += 1;
        }

        String result = sb.toString();

        // 输出: 替换字符后的字符串
        if ('a' > replaceChar) {
            System.out.println(result);
        } else {
            System.out.println(result + ", " + replacedString + " is replaced by " + replaceChar);
        }

        // 如果结果字符串中仍然有3个或更多连续字符，则递归调用此方法
        ConsecutiveCharsHandle consecutiveCharsHandle = new ConsecutiveCharsHandle();
        if (consecutiveCharsHandle.handleChars(result, 3)) {
            replaceConsecutiveChars(result);
        }
        System.out.println("###########################");
    }

}
