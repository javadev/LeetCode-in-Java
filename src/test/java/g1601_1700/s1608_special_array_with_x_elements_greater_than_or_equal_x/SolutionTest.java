package g1601_1700.s1608_special_array_with_x_elements_greater_than_or_equal_x;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void specialArray() {
        assertThat(new Solution().specialArray(new int[] {3, 5}), equalTo(2));
    }

    @Test
    void specialArray2() {
        assertThat(new Solution().specialArray(new int[] {0, 0}), equalTo(-1));
    }

    @Test
    void specialArray3() {
        assertThat(new Solution().specialArray(new int[] {0, 4, 3, 0, 4}), equalTo(3));
    }
}
