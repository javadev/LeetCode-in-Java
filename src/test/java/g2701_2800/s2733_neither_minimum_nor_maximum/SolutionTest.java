package g2701_2800.s2733_neither_minimum_nor_maximum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findNonMinOrMax() {
        assertThat(new Solution().findNonMinOrMax(new int[] {3, 2, 1, 4}), equalTo(3));
    }

    @Test
    void findNonMinOrMax2() {
        assertThat(new Solution().findNonMinOrMax(new int[] {1, 2}), equalTo(-1));
    }

    @Test
    void findNonMinOrMax3() {
        assertThat(new Solution().findNonMinOrMax(new int[] {2, 1, 3}), equalTo(2));
    }
}
