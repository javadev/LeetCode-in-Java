package g0401_0500.s0410_split_array_largest_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitArray() {
        assertThat(new Solution().splitArray(new int[] {7, 2, 5, 10, 8}, 2), equalTo(18));
    }

    @Test
    void splitArray2() {
        assertThat(new Solution().splitArray(new int[] {1, 2, 3, 4, 5}, 2), equalTo(9));
    }

    @Test
    void splitArray3() {
        assertThat(new Solution().splitArray(new int[] {1, 4, 4}, 3), equalTo(4));
    }
}
