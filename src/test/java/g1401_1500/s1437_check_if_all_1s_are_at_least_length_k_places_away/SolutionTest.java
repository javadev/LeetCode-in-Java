package g1401_1500.s1437_check_if_all_1s_are_at_least_length_k_places_away;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kLengthApart() {
        assertThat(
                new Solution().kLengthApart(new int[] {1, 0, 0, 0, 1, 0, 0, 1}, 2), equalTo(true));
    }

    @Test
    void kLengthApart2() {
        assertThat(new Solution().kLengthApart(new int[] {1, 0, 0, 1, 0, 1}, 2), equalTo(false));
    }
}
