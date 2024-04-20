package g1401_1500.s1475_final_prices_with_a_special_discount_in_a_shop;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void finalPrices() {
        assertThat(
                new Solution().finalPrices(new int[] {8, 4, 6, 2, 3}),
                equalTo(new int[] {4, 2, 4, 2, 3}));
    }

    @Test
    void finalPrices2() {
        assertThat(
                new Solution().finalPrices(new int[] {1, 2, 3, 4, 5}),
                equalTo(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    void finalPrices3() {
        assertThat(
                new Solution().finalPrices(new int[] {10, 1, 1, 6}),
                equalTo(new int[] {9, 0, 1, 6}));
    }
}
