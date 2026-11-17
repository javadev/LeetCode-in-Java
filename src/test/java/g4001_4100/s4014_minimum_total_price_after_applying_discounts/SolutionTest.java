package g4001_4100.s4014_minimum_total_price_after_applying_discounts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPrice() {
        assertThat(
                new Solution().minPrice(new int[] {10, 30, 21}, new int[] {50, 60}), equalTo(32.5));
    }

    @Test
    void minPrice2() {
        assertThat(
                new Solution().minPrice(new int[] {100, 70}, new int[] {10, 40, 50}),
                equalTo(92.0));
    }

    @Test
    void minPrice3() {
        assertThat(
                new Solution().minPrice(new int[] {7, 3, 9}, new int[] {100, 100}), equalTo(3.0));
    }
}
