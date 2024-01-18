package g2401_2500.s2407_longest_increasing_subsequence_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthOfLIS() {
        assertThat(
                new Solution().lengthOfLIS(new int[] {4, 2, 1, 4, 3, 4, 5, 8, 15}, 3), equalTo(5));
    }

    @Test
    void lengthOfLIS2() {
        assertThat(new Solution().lengthOfLIS(new int[] {7, 4, 5, 1, 8, 12, 4, 7}, 5), equalTo(4));
    }

    @Test
    void lengthOfLIS3() {
        assertThat(new Solution().lengthOfLIS(new int[] {1, 5}, 1), equalTo(1));
    }
}
