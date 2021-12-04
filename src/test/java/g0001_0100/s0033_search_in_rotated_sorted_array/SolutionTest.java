package g0001_0100.s0033_search_in_rotated_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void search() {
        assertThat(new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0), equalTo(4));
    }

    @Test
    void search2() {
        assertThat(new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3), equalTo(-1));
    }

    @Test
    void search3() {
        assertThat(new Solution().search(new int[] {1}, 0), equalTo(-1));
    }
}
