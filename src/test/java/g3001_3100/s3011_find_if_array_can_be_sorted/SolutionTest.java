package g3001_3100.s3011_find_if_array_can_be_sorted;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canSortArray() {
        assertThat(new Solution().canSortArray(new int[] {8, 4, 2, 30, 15}), equalTo(true));
    }

    @Test
    void canSortArray2() {
        assertThat(new Solution().canSortArray(new int[] {1, 2, 3, 4, 5}), equalTo(true));
    }

    @Test
    void canSortArray3() {
        assertThat(new Solution().canSortArray(new int[] {3, 16, 8, 4, 2}), equalTo(false));
    }
}
