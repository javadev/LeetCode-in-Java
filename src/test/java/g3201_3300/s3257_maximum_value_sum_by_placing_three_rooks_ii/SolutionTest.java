package g3201_3300.s3257_maximum_value_sum_by_placing_three_rooks_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumValueSum() {
        assertThat(
                new Solution()
                        .maximumValueSum(
                                new int[][] {{-3, 1, 1, 1}, {-3, 1, -3, 1}, {-3, 2, 1, 1}}),
                equalTo(4L));
    }

    @Test
    void maximumValueSum2() {
        assertThat(
                new Solution().maximumValueSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                equalTo(15L));
    }

    @Test
    void maximumValueSum3() {
        assertThat(
                new Solution().maximumValueSum(new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}),
                equalTo(3L));
    }
}
