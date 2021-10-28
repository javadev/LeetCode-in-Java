package s0028_implement_strstr;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void implementStrStr() {
        Assert.assertEquals(2, new Solution().strStr("hello", "ll"));
    }
}
