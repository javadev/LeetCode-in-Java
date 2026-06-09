package g3801_3900.s3806_maximum_bitwise_and_after_increment_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumAND() {
        assertThat(new Solution().maximumAND(new int[] {3, 1, 2}, 8, 2), equalTo(6));
    }

    @Test
    void maximumAND2() {
        assertThat(new Solution().maximumAND(new int[] {1, 2, 8, 4}, 7, 3), equalTo(4));
    }

    @Test
    void maximumAND3() {
        assertThat(new Solution().maximumAND(new int[] {1, 1}, 3, 2), equalTo(2));
    }
}
