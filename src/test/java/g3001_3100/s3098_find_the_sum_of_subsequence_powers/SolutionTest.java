package g3001_3100.s3098_find_the_sum_of_subsequence_powers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfPowers() {
        assertThat(new Solution().sumOfPowers(new int[] {1, 2, 3, 4}, 3), equalTo(4));
    }

    @Test
    void sumOfPowers2() {
        assertThat(new Solution().sumOfPowers(new int[] {2, 2}, 2), equalTo(0));
    }

    @Test
    void sumOfPowers3() {
        assertThat(new Solution().sumOfPowers(new int[] {4, 3, -1}, 2), equalTo(10));
    }
}
