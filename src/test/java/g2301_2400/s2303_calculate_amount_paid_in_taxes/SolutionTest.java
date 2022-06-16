package g2301_2400.s2303_calculate_amount_paid_in_taxes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void calculateTax() {
        assertThat(
                new Solution().calculateTax(new int[][] {{3, 50}, {7, 10}, {12, 25}}, 10),
                equalTo(2.65000));
    }

    @Test
    void calculateTax2() {
        assertThat(
                new Solution().calculateTax(new int[][] {{1, 0}, {4, 25}, {5, 50}}, 2),
                equalTo(0.25000));
    }

    @Test
    void calculateTax3() {
        assertThat(
                new Solution().calculateTax(new int[][] {{1, 0}, {4, 25}, {5, 50}}, 0),
                equalTo(0D));
    }
}
