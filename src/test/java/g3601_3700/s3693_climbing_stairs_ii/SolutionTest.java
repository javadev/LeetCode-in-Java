package g3601_3700.s3693_climbing_stairs_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void climbStairs() {
        assertThat(new Solution().climbStairs(4, new int[] {1, 2, 3, 4}), equalTo(13));
    }

    @Test
    void climbStairs2() {
        assertThat(new Solution().climbStairs(4, new int[] {5, 1, 6, 2}), equalTo(11));
    }

    @Test
    void climbStairs3() {
        assertThat(new Solution().climbStairs(3, new int[] {9, 8, 3}), equalTo(12));
    }
}
