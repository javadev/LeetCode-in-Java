package g2001_2100.s2012_sum_of_beauty_in_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfBeauties() {
        assertThat(new Solution().sumOfBeauties(new int[] {1, 2, 3}), equalTo(2));
    }

    @Test
    void sumOfBeauties2() {
        assertThat(new Solution().sumOfBeauties(new int[] {2, 4, 6, 4}), equalTo(1));
    }

    @Test
    void sumOfBeauties3() {
        assertThat(new Solution().sumOfBeauties(new int[] {3, 2, 1}), equalTo(0));
    }
}
