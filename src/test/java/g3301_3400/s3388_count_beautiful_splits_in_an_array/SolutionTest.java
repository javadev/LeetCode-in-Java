package g3301_3400.s3388_count_beautiful_splits_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulSplits() {
        assertThat(new Solution().beautifulSplits(new int[] {1, 1, 2, 1}), equalTo(2));
    }

    @Test
    void beautifulSplits2() {
        assertThat(new Solution().beautifulSplits(new int[] {1, 2, 3, 4}), equalTo(0));
    }
}
