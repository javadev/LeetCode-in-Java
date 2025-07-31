package g3601_3700.s3630_partition_array_for_maximum_xor_and_and;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeXorAndXor() {
        assertThat(new Solution().maximizeXorAndXor(new int[] {2, 3}), equalTo(5L));
    }

    @Test
    void maximizeXorAndXor2() {
        assertThat(new Solution().maximizeXorAndXor(new int[] {1, 3, 2}), equalTo(6L));
    }

    @Test
    void maximizeXorAndXor3() {
        assertThat(new Solution().maximizeXorAndXor(new int[] {2, 3, 6, 7}), equalTo(15L));
    }
}
