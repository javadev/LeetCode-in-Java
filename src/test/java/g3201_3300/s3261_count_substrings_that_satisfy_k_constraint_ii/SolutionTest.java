package g3201_3300.s3261_count_substrings_that_satisfy_k_constraint_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countKConstraintSubstrings() {
        assertThat(
                new Solution().countKConstraintSubstrings("0001111", 2, new int[][] {{0, 6}}),
                equalTo(new long[] {26}));
    }

    @Test
    void countKConstraintSubstrings2() {
        assertThat(
                new Solution()
                        .countKConstraintSubstrings(
                                "010101", 1, new int[][] {{0, 5}, {1, 4}, {2, 3}}),
                equalTo(new long[] {15, 9, 3}));
    }
}
