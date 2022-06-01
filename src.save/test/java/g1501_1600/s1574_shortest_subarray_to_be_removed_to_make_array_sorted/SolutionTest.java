package g1501_1600.s1574_shortest_subarray_to_be_removed_to_make_array_sorted;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLengthOfShortestSubarray() {
        assertThat(
                new Solution().findLengthOfShortestSubarray(new int[] {1, 2, 3, 10, 4, 2, 3, 5}),
                equalTo(3));
    }

    @Test
    void findLengthOfShortestSubarray2() {
        assertThat(
                new Solution().findLengthOfShortestSubarray(new int[] {5, 4, 3, 2, 1}), equalTo(4));
    }

    @Test
    void findLengthOfShortestSubarray3() {
        assertThat(new Solution().findLengthOfShortestSubarray(new int[] {1, 2, 3}), equalTo(0));
    }
}
