package g0001_0100.s0027_remove_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void removeElement() {
        int[] expected = new int[] {2, 2};
        int[] original = new int[] {3, 2, 2, 3};
        int end = new Solution().removeElement(original, 3);
        assertThat(Arrays.copyOfRange(original, 0, end), equalTo(expected));
    }
}
