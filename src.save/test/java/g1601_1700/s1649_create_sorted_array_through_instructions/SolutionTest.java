package g1601_1700.s1649_create_sorted_array_through_instructions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void createSortedArray() {
        assertThat(new Solution().createSortedArray(new int[] {1, 5, 6, 2}), equalTo(1));
    }

    @Test
    void createSortedArray2() {
        assertThat(new Solution().createSortedArray(new int[] {1, 2, 3, 6, 5, 4}), equalTo(3));
    }

    @Test
    void createSortedArray3() {
        assertThat(
                new Solution().createSortedArray(new int[] {1, 3, 3, 3, 2, 4, 2, 1, 2}),
                equalTo(4));
    }
}
