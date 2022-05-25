package g1001_1100.s1013_partition_array_into_three_parts_with_equal_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canThreePartsEqualSum() {
        assertThat(
                new Solution().canThreePartsEqualSum(new int[] {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}),
                equalTo(true));
    }

    @Test
    void canThreePartsEqualSum2() {
        assertThat(
                new Solution().canThreePartsEqualSum(new int[] {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}),
                equalTo(false));
    }

    @Test
    void canThreePartsEqualSum3() {
        assertThat(
                new Solution().canThreePartsEqualSum(new int[] {3, 3, 6, 5, -2, 2, 5, 1, -9, 4}),
                equalTo(true));
    }
}
