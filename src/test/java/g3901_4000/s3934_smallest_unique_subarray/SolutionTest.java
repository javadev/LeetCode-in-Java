package g3901_4000.s3934_smallest_unique_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestUniqueSubarray() {
        assertThat(new Solution().smallestUniqueSubarray(new int[] {3, 3, 3}), equalTo(3));
    }

    @Test
    void smallestUniqueSubarray2() {
        assertThat(new Solution().smallestUniqueSubarray(new int[] {2, 1, 2, 3, 3}), equalTo(1));
    }

    @Test
    void smallestUniqueSubarray3() {
        assertThat(new Solution().smallestUniqueSubarray(new int[] {1, 1, 2, 2, 1}), equalTo(2));
    }

    @Test
    void smallestUniqueSubarray4() {
        assertThat(new Solution().smallestUniqueSubarray(new int[] {100000}), equalTo(1));
    }

    @Test
    void smallestUniqueSubarray5() {
        assertThat(new Solution().smallestUniqueSubarray(new int[] {1, 2, 1, 2}), equalTo(2));
    }

    @Test
    void smallestUniqueSubarray6() {
        assertThat(new Solution().smallestUniqueSubarray(new int[] {1, 2, 1, 2, 1, 2}), equalTo(4));
    }

    @Test
    void smallestUniqueSubarray7() {
        assertThat(
                new Solution().smallestUniqueSubarray(new int[] {100000, 1, 100000, 1}),
                equalTo(2));
    }
}
