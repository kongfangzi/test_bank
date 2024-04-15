import com.testbk.demo.StringReplaceConsecutiveChars;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Liu Feng
 * @version 1.0
 * @packageName PACKAGE_NAME
 * @className StringReplaceConsecutiveCharsTest
 * @date 2024/4/12 1:13
 * @description 字符串替换连续字符测试类
 */
public class StringReplaceConsecutiveCharsTest {

    @Autowired
    private StringReplaceConsecutiveChars replaceConsecutiveChars;

    @Test
    public void testStringReplaceConsecutiveChars() {
        String input = "abcccbad";
        replaceConsecutiveChars.replaceConsecutiveChars(input);
    }
}
