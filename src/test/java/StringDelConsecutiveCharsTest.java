import com.testbk.demo.StringDelConsecutiveChars;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Liu Feng
 * @version 1.0
 * @packageName PACKAGE_NAME
 * @className StringTest
 * @date 2024/4/12 1:03
 * @description 字符串去除连续相同字符测试类
 */
public class StringDelConsecutiveCharsTest {

    @Autowired
    private StringDelConsecutiveChars delConsecutiveChars;

    @Test
    public void testStringDelConsecutiveChars() {
        String input = "aabcccbbad";
        delConsecutiveChars.removeConsecutiveChars(input);
    }
}
