package g2501_2600.s2600_k_items_with_the_maximum_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kItemsWithMaximumSum() {
        assertThat(new Solution().kItemsWithMaximumSum(3, 2, 0, 2), equalTo(2));
    }

    @Test
    void kItemsWithMaximumSum2() {
        assertThat(new Solution().kItemsWithMaximumSum(3, 2, 0, 4), equalTo(3));
    }
}
