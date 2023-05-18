package g1001_1100.s1053_previous_permutation_with_one_swap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void prevPermOpt1() {
        assertThat(new Solution().prevPermOpt1(new int[] {3, 2, 1}), equalTo(new int[] {3, 1, 2}));
    }

    @Test
    void prevPermOpt2() {
        assertThat(new Solution().prevPermOpt1(new int[] {1, 1, 5}), equalTo(new int[] {1, 1, 5}));
    }

    @Test
    void prevPermOpt3() {
        assertThat(
                new Solution().prevPermOpt1(new int[] {1, 9, 4, 6, 7}),
                equalTo(new int[] {1, 7, 4, 6, 9}));
    }
}
