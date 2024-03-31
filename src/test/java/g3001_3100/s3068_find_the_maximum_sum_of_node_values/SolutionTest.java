package g3001_3100.s3068_find_the_maximum_sum_of_node_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumValueSum() {
        assertThat(
                new Solution()
                        .maximumValueSum(new int[] {1, 2, 1}, 3, new int[][] {{0, 1}, {0, 2}}),
                equalTo(6L));
    }

    @Test
    void maximumValueSum2() {
        assertThat(
                new Solution().maximumValueSum(new int[] {2, 3}, 7, new int[][] {{0, 1}}),
                equalTo(9L));
    }

    @Test
    void maximumValueSum3() {
        assertThat(
                new Solution()
                        .maximumValueSum(
                                new int[] {7, 7, 7, 7, 7, 7},
                                3,
                                new int[][] {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}}),
                equalTo(42L));
    }
}
