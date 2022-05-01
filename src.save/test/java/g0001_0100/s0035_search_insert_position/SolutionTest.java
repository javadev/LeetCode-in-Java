package g0001_0100.s0035_search_insert_position;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void searchInsert() {
        assertThat(new Solution().searchInsert(new int[] {1, 3, 5, 6}, 5), equalTo(2));
    }

    @Test
    void searchInsert2() {
        assertThat(new Solution().searchInsert(new int[] {1, 3, 5, 6}, 2), equalTo(1));
    }

    @Test
    void searchInsert3() {
        assertThat(new Solution().searchInsert(new int[] {1, 3, 5, 6}, 7), equalTo(4));
    }
}
