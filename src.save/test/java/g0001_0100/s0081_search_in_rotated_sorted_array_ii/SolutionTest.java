package g0001_0100.s0081_search_in_rotated_sorted_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void search() {
        assertThat(new Solution().search(new int[] {2, 5, 6, 0, 0, 1, 2}, 0), equalTo(true));
    }

    @Test
    void search2() {
        assertThat(new Solution().search(new int[] {2, 5, 6, 0, 0, 1, 2}, 3), equalTo(false));
    }
}
