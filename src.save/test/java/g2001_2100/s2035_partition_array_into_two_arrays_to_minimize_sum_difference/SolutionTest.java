package g2001_2100.s2035_partition_array_into_two_arrays_to_minimize_sum_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDifference() {
        assertThat(new Solution().minimumDifference(new int[] {3, 9, 7, 3}), equalTo(2));
    }

    @Test
    void minimumDifference2() {
        assertThat(new Solution().minimumDifference(new int[] {-36, 36}), equalTo(72));
    }

    @Test
    void minimumDifference3() {
        assertThat(new Solution().minimumDifference(new int[] {2, -1, 0, 4, -2, -9}), equalTo(0));
    }
}
