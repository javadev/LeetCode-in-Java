package g0601_0700.s0697_degree_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findShortestSubArray() {
        assertThat(new Solution().findShortestSubArray(new int[] {1, 2, 2, 3, 1}), equalTo(2));
    }

    @Test
    void findShortestSubArray2() {
        assertThat(
                new Solution().findShortestSubArray(new int[] {1, 2, 2, 3, 1, 4, 2}), equalTo(6));
    }
}
