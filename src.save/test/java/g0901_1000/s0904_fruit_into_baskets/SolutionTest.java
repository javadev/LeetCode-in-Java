package g0901_1000.s0904_fruit_into_baskets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalFruit() {
        assertThat(new Solution().totalFruit(new int[] {1, 2, 1}), equalTo(3));
    }

    @Test
    void totalFruit2() {
        assertThat(new Solution().totalFruit(new int[] {0, 1, 2, 2}), equalTo(3));
    }

    @Test
    void totalFruit3() {
        assertThat(new Solution().totalFruit(new int[] {1, 2, 3, 2, 2}), equalTo(4));
    }
}
