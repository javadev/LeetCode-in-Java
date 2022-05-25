package g1401_1500.s1402_reducing_dishes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSatisfaction() {
        assertThat(new Solution().maxSatisfaction(new int[] {-1, -8, 0, 5, -9}), equalTo(14));
    }

    @Test
    void maxSatisfaction2() {
        assertThat(new Solution().maxSatisfaction(new int[] {4, 3, 2}), equalTo(20));
    }

    @Test
    void maxSatisfaction3() {
        assertThat(new Solution().maxSatisfaction(new int[] {-1, -4, -5}), equalTo(0));
    }
}
