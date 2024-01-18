package g0001_0100.s0034_find_first_and_last_position_of_element_in_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void searchRange() {
        int[] expected = new int[] {3, 4};
        int[] actual = new Solution().searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8);
        assertThat(actual, equalTo(expected));
    }

    @Test
    void searchRange2() {
        int[] expected = new int[] {-1, -1};
        int[] actual = new Solution().searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6);
        assertThat(actual, equalTo(expected));
    }

    @Test
    void searchRange3() {
        int[] expected = new int[] {-1, -1};
        int[] actual = new Solution().searchRange(new int[] {}, 0);
        assertThat(actual, equalTo(expected));
    }
}
