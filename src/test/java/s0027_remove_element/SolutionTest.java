package s0027_remove_element;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void removeElement() {
        int[] expected = new int[] {2, 2};
        int[] original = new int[] {3, 2, 2, 3};
        int end = new Solution().removeElement(original, 3);
        Assert.assertArrayEquals(expected, Arrays.copyOfRange(original, 0, end));
    }
}
