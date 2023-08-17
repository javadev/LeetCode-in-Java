package g1601_1700.s1695_maximum_erasure_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumUniqueSubarray() {
        assertThat(new Solution().maximumUniqueSubarray(new int[] {4, 2, 4, 5, 6}), equalTo(17));
    }

    @Test
    void maximumUniqueSubarray2() {
        assertThat(
                new Solution().maximumUniqueSubarray(new int[] {5, 2, 1, 2, 5, 2, 1, 2, 5}),
                equalTo(8));
    }
}
