package g3101_3200.s3117_minimum_sum_of_values_by_dividing_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumValueSum() {
        assertThat(
                new Solution().minimumValueSum(new int[] {1, 4, 3, 3, 2}, new int[] {0, 3, 3, 2}),
                equalTo(12));
    }

    @Test
    void minimumValueSum2() {
        assertThat(
                new Solution()
                        .minimumValueSum(new int[] {2, 3, 5, 7, 7, 7, 5}, new int[] {0, 7, 5}),
                equalTo(17));
    }

    @Test
    void minimumValueSum3() {
        assertThat(
                new Solution().minimumValueSum(new int[] {1, 2, 3, 4}, new int[] {2}), equalTo(-1));
    }
}
