package g2401_2500.s2481_minimum_cuts_to_divide_a_circle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfCuts() {
        assertThat(new Solution().numberOfCuts(4), equalTo(2));
    }

    @Test
    void numberOfCuts2() {
        assertThat(new Solution().numberOfCuts(3), equalTo(3));
    }

    @Test
    void numberOfCuts3() {
        assertThat(new Solution().numberOfCuts(1), equalTo(0));
    }

    @Test
    void numberOfCuts4() {
        assertThat(new Solution().numberOfCuts(6), equalTo(3));
    }

    @Test
    void numberOfCuts5() {
        assertThat(new Solution().numberOfCuts(5), equalTo(5));
    }

    @Test
    void numberOfCuts6() {
        assertThat(new Solution().numberOfCuts(100), equalTo(50));
    }

    @Test
    void numberOfCuts7() {
        assertThat(new Solution().numberOfCuts(101), equalTo(101));
    }

    @Test
    void numberOfCuts8() {
        assertThat(new Solution().numberOfCuts(2), equalTo(1));
    }

    @Test
    void numberOfCuts9() {
        assertThat(new Solution().numberOfCuts(3), equalTo(3));
    }
}
