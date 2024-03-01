package g1401_1500.s1497_check_if_array_pairs_are_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canArrange() {
        assertThat(
                new Solution().canArrange(new int[] {1, 2, 3, 4, 5, 10, 6, 7, 8, 9}, 5),
                equalTo(true));
    }

    @Test
    void canArrange2() {
        assertThat(new Solution().canArrange(new int[] {1, 2, 3, 4, 5, 6}, 7), equalTo(true));
    }

    @Test
    void canArrange3() {
        assertThat(new Solution().canArrange(new int[] {1, 2, 3, 4, 5, 6}, 10), equalTo(false));
    }
}
