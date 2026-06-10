package g3801_3900.s3814_maximum_capacity_within_budget;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCapacity() {
        assertThat(
                new Solution().maxCapacity(new int[] {4, 8, 5, 3}, new int[] {1, 5, 2, 7}, 8),
                equalTo(8));
    }

    @Test
    void maxCapacity2() {
        assertThat(
                new Solution().maxCapacity(new int[] {3, 5, 7, 4}, new int[] {2, 4, 3, 6}, 7),
                equalTo(6));
    }

    @Test
    void maxCapacity3() {
        assertThat(
                new Solution().maxCapacity(new int[] {2, 2, 2}, new int[] {3, 5, 4}, 5),
                equalTo(9));
    }
}
