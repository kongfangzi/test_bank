import com.testbk.demo.StringDelConsecutiveChars;
import com.testbk.demo.StringReplaceConsecutiveChars;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Liu Feng
 * @version 1.0
 * @packageName PACKAGE_NAME
 * @className StringHandleConsecutiveCharsTest
 * @date 2024/4/19 3:25
 * @description 测试类
 */
public class StringHandleConsecutiveCharsTest {

    @Autowired
    private StringDelConsecutiveChars delConsecutiveChars;

    @Autowired
    private StringReplaceConsecutiveChars replaceConsecutiveChars;

    @Test
    public void testStringReplaceConsecutiveChars() {
        String input = "abcccbad";
        replaceConsecutiveChars.replaceConsecutiveChars(input);
    }
    @Test
    public void testStringDelConsecutiveChars() {
        String input = "aabcccbbad";
        delConsecutiveChars.removeConsecutiveChars(input);
    }

}
