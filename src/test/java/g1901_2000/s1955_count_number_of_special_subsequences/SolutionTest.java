package g1901_2000.s1955_count_number_of_special_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSpecialSubsequences() {
        assertThat(new Solution().countSpecialSubsequences(new int[] {0, 1, 2, 2}), equalTo(3));
    }

    @Test
    void countSpecialSubsequences2() {
        assertThat(new Solution().countSpecialSubsequences(new int[] {2, 2, 0, 0}), equalTo(0));
    }

    @Test
    void countSpecialSubsequences3() {
        assertThat(
                new Solution().countSpecialSubsequences(new int[] {0, 1, 2, 0, 1, 2}), equalTo(7));
    }
}
