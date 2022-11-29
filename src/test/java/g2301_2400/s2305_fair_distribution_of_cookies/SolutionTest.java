package g2301_2400.s2305_fair_distribution_of_cookies;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distributeCookies() {
        assertThat(new Solution().distributeCookies(new int[] {8, 15, 10, 20, 8}, 2), equalTo(31));
    }

    @Test
    void distributeCookies2() {
        assertThat(
                new Solution().distributeCookies(new int[] {6, 1, 3, 2, 2, 4, 1, 2}, 3),
                equalTo(7));
    }
}
