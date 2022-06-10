package g0001_0100.s0027_remove_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeElement() {
        int[] original = {3, 2, 2, 3};
        int end = new Solution().removeElement(original, 3);
        assertThat(Arrays.copyOfRange(original, 0, end), equalTo(new int[] {2, 2}));
    }

    @Test
    void removeElement2() {
        int[] original = {0, 1, 2, 2, 3, 0, 4, 2};
        int end = new Solution().removeElement(original, 2);
        assertThat(Arrays.copyOfRange(original, 0, end), equalTo(new int[] {0, 1, 4, 0, 3}));
    }
}
