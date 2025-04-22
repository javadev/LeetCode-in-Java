package g3501_3600.s3523_make_array_non_decreasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumPossibleSize() {
        assertThat(new Solution().maximumPossibleSize(new int[] {4, 2, 5, 3, 5}), equalTo(3));
    }

    @Test
    void maximumPossibleSize2() {
        assertThat(new Solution().maximumPossibleSize(new int[] {1, 2, 3}), equalTo(3));
    }
}
