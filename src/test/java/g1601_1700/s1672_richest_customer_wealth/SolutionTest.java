package g1601_1700.s1672_richest_customer_wealth;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumWealth() {
        assertThat(new Solution().maximumWealth(new int[][] {{1, 2, 3}, {3, 2, 1}}), equalTo(6));
    }

    @Test
    void maximumWealth2() {
        assertThat(new Solution().maximumWealth(new int[][] {{1, 5}, {7, 3}, {3, 5}}), equalTo(10));
    }
}
