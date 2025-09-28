package g3601_3700.s3698_split_array_with_minimum_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitArray() {
        assertThat(new Solution().splitArray(new int[] {1, 3, 2}), equalTo(2L));
    }

    @Test
    void splitArray2() {
        assertThat(new Solution().splitArray(new int[] {1, 2, 4, 3}), equalTo(4L));
    }

    @Test
    void splitArray3() {
        assertThat(new Solution().splitArray(new int[] {3, 1, 2}), equalTo(-1L));
    }
}
