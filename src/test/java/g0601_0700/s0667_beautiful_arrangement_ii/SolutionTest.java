package g0601_0700.s0667_beautiful_arrangement_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructArray() {
        assertThat(new Solution().constructArray(3, 1), equalTo(new int[] {3, 2, 1}));
    }

    @Test
    void constructArray2() {
        assertThat(new Solution().constructArray(3, 2), equalTo(new int[] {1, 3, 2}));
    }
}
