package g3501_3600.s3569_maximize_count_of_distinct_primes_after_split;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumCount() {
        assertThat(
                new Solution()
                        .maximumCount(new int[] {2, 1, 3, 1, 2}, new int[][] {{1, 2}, {3, 3}}),
                equalTo(new int[] {3, 4}));
    }

    @Test
    void maximumCount2() {
        assertThat(
                new Solution().maximumCount(new int[] {2, 1, 4}, new int[][] {{0, 1}}),
                equalTo(new int[] {0}));
    }

    @Test
    void maximumCount3() {
        assertThat(
                new Solution().maximumCount(new int[] {2, 3}, new int[][] {{1, 2}, {1, 3}}),
                equalTo(new int[] {2, 3}));
    }

    @Test
    void maximumCount4() {
        assertThat(
                new Solution().maximumCount(new int[] {4, 2}, new int[][] {{0, 2}, {0, 2}}),
                equalTo(new int[] {2, 2}));
    }
}
