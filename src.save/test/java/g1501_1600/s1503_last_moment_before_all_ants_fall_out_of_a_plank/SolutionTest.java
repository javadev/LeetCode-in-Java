package g1501_1600.s1503_last_moment_before_all_ants_fall_out_of_a_plank;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getLastMoment() {
        assertThat(new Solution().getLastMoment(4, new int[] {4, 3}, new int[] {0, 1}), equalTo(4));
    }

    @Test
    void getLastMoment2() {
        assertThat(
                new Solution().getLastMoment(7, new int[] {}, new int[] {0, 1, 2, 3, 4, 5, 6, 7}),
                equalTo(7));
    }

    @Test
    void getLastMoment3() {
        assertThat(
                new Solution().getLastMoment(7, new int[] {0, 1, 2, 3, 4, 5, 6, 7}, new int[] {}),
                equalTo(7));
    }
}
