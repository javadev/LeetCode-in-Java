package g2901_3000.s2948_make_lexicographically_smallest_array_by_swapping_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexicographicallySmallestArray() {
        assertThat(
                new Solution().lexicographicallySmallestArray(new int[] {1, 5, 3, 9, 8}, 2),
                equalTo(new int[] {1, 3, 5, 8, 9}));
    }

    @Test
    void lexicographicallySmallestArray2() {
        assertThat(
                new Solution().lexicographicallySmallestArray(new int[] {1, 7, 6, 18, 2, 1}, 3),
                equalTo(new int[] {1, 6, 7, 18, 1, 2}));
    }

    @Test
    void lexicographicallySmallestArray3() {
        assertThat(
                new Solution().lexicographicallySmallestArray(new int[] {1, 7, 28, 19, 10}, 3),
                equalTo(new int[] {1, 7, 28, 19, 10}));
    }
}
