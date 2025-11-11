package g0801_0900.s0852_peak_index_in_a_mountain_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void peakIndexInMountainArray() {
        assertThat(new Solution().peakIndexInMountainArray(new int[] {0, 1, 0}), equalTo(1));
    }

    @Test
    void peakIndexInMountainArray2() {
        assertThat(new Solution().peakIndexInMountainArray(new int[] {0, 2, 1, 0}), equalTo(1));
    }

    @Test
    void peakIndexInMountainArray3() {
        assertThat(new Solution().peakIndexInMountainArray(new int[] {0, 10, 5, 2}), equalTo(1));
    }

    @Test
    void peakIndexInMountainArray4() {
        assertThat(
                new Solution().peakIndexInMountainArray(new int[] {0, 1, 2, 3, 2, 1}), equalTo(3));
    }

    @Test
    void peakIndexInMountainArray5() {
        assertThat(new Solution().peakIndexInMountainArray(new int[] {5, 10, 7}), equalTo(1));
    }

    @Test
    void peakIndexInMountainArray6() {
        assertThat(new Solution().peakIndexInMountainArray(new int[] {5, 4, 3, 2, 1}), equalTo(1));
    }

    @Test
    void peakIndexInMountainArray7() {
        assertThat(new Solution().peakIndexInMountainArray(new int[] {1, 2, 3, 4, 5}), equalTo(-1));
    }

    @Test
    void peakIndexInMountainArray8() {
        assertThat(new Solution().peakIndexInMountainArray(new int[] {3, 3, 3, 3}), equalTo(-1));
    }
}
