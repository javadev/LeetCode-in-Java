package g2201_2300.s2270_number_of_ways_to_split_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToSplitArray() {
        assertThat(new Solution().waysToSplitArray(new int[] {10, 4, -8, 7}), equalTo(2));
    }

    @Test
    void waysToSplitArray2() {
        assertThat(new Solution().waysToSplitArray(new int[] {2, 3, 1, 0}), equalTo(2));
    }
}
