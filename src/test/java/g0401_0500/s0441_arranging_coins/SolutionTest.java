package g0401_0500.s0441_arranging_coins;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKthNumber() {
        assertThat(new Solution().arrangeCoins(5), equalTo(2));
    }

    @Test
    void arrangeCoins2() {
        assertThat(new Solution().arrangeCoins(8), equalTo(3));
    }

    @Test
    void arrangeCoins3() {
        assertThat(new Solution().arrangeCoins(0), equalTo(0));
    }

    @Test
    void arrangeCoins4() {
        assertThat(new Solution().arrangeCoins(1), equalTo(1));
    }

    @Test
    void arrangeCoins5() {
        assertThat(new Solution().arrangeCoins(2), equalTo(1));
    }

    @Test
    void arrangeCoins6() {
        assertThat(new Solution().arrangeCoins(3), equalTo(2));
    }

    @Test
    void arrangeCoins7() {
        assertThat(new Solution().arrangeCoins(6), equalTo(3));
    }

    @Test
    void arrangeCoins8() {
        assertThat(new Solution().arrangeCoins(2147483647), equalTo(65535));
    }

    @Test
    void arrangeCoins9() {
        assertThat(new Solution().arrangeCoins(7), equalTo(3));
    }

    @Test
    void arrangeCoins10() {
        Solution solution = new Solution();

        Exception exception =
                assertThrows(IllegalArgumentException.class, () -> solution.arrangeCoins(-5));

        assertThat(
                exception.getMessage(),
                equalTo("Input Number is invalid. Only positive numbers are allowed"));
    }
}
