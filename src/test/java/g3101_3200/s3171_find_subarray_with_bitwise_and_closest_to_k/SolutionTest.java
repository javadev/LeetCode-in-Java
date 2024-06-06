package g3101_3200.s3171_find_subarray_with_bitwise_and_closest_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDifference() {
        assertThat(new Solution().minimumDifference(new int[] {1, 2, 4, 5}, 3), equalTo(1));
    }

    @Test
    void minimumDifference2() {
        assertThat(new Solution().minimumDifference(new int[] {1, 2, 1, 2}, 2), equalTo(0));
    }

    @Test
    void minimumDifference3() {
        assertThat(new Solution().minimumDifference(new int[] {1}, 10), equalTo(9));
    }
}
