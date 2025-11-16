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

    @Test
    void kItemsWithMaximumSum3() {
        assertThat(new Solution().kItemsWithMaximumSum(5, 3, 2, 5), equalTo(5));
    }

    @Test
    void kItemsWithMaximumSum4() {
        assertThat(new Solution().kItemsWithMaximumSum(3, 4, 5, 7), equalTo(3));
    }

    @Test
    void kItemsWithMaximumSum5() {
        assertThat(new Solution().kItemsWithMaximumSum(3, 1, 5, 6), equalTo(2));
    }

    @Test
    void kItemsWithMaximumSum6() {
        assertThat(new Solution().kItemsWithMaximumSum(2, 1, 10, 13), equalTo(-8));
    }

    @Test
    void kItemsWithMaximumSum7() {
        assertThat(new Solution().kItemsWithMaximumSum(0, 5, 5, 3), equalTo(0));
    }

    @Test
    void kItemsWithMaximumSum8() {
        assertThat(new Solution().kItemsWithMaximumSum(2, 0, 5, 3), equalTo(1));
    }

    @Test
    void kItemsWithMaximumSum9() {
        assertThat(new Solution().kItemsWithMaximumSum(4, 3, 0, 6), equalTo(4));
    }

    @Test
    void kItemsWithMaximumSum10() {
        assertThat(new Solution().kItemsWithMaximumSum(5, 5, 5, 0), equalTo(0));
    }
}
