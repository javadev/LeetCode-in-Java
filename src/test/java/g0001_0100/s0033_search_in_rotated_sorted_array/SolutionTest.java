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

    @Test
    void search4() {
        assertThat(new Solution().search(new int[] {1, 2, 3, 4, 5, 6}, 4), equalTo(3));
    }

    @Test
    void search5() {
        assertThat(new Solution().search(new int[] {1, 2, 3, 4, 5, 6}, 10), equalTo(-1));
    }

    @Test
    void search6() {
        assertThat(new Solution().search(new int[] {6, 7, 0, 1, 2, 3, 4}, 7), equalTo(1));
    }

    @Test
    void search7() {
        assertThat(new Solution().search(new int[] {6, 7, 0, 1, 2, 3, 4}, 3), equalTo(5));
    }

    @Test
    void search8() {
        assertThat(new Solution().search(new int[] {5, 1}, 1), equalTo(1));
    }

    @Test
    void search9() {
        assertThat(new Solution().search(new int[] {5, 1}, 2), equalTo(-1));
    }

    @Test
    void search10() {
        assertThat(new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 4), equalTo(0));
    }

    @Test
    void search11() {
        assertThat(new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 2), equalTo(6));
    }

    @Test
    void search12() {
        assertThat(new Solution().search(new int[] {2, 3, 4, 5, 6, 0, 1}, 0), equalTo(5));
    }

    @Test
    void search13() {
        assertThat(new Solution().search(new int[] {0, 1, 2, 3, 4, 5}, 3), equalTo(3));
    }

    @Test
    void search14() {
        assertThat(new Solution().search(new int[] {5, 6, 7, 0, 1, 2, 3}, 2), equalTo(5));
    }

    @Test
    void search15() {
        assertThat(new Solution().search(new int[] {5, 6, 7, 0, 1, 2, 3}, 6), equalTo(1));
    }
}
