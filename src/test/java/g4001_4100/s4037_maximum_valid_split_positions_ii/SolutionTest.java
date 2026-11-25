package g4001_4100.s4037_maximum_valid_split_positions_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValidSplits() {
        assertThat(new Solution().maxValidSplits(new int[] {2, 4, 6}), equalTo(1));
    }

    @Test
    void maxValidSplits2() {
        assertThat(new Solution().maxValidSplits(new int[] {3, 3, 3}), equalTo(2));
    }

    @Test
    void maxValidSplits3() {
        assertThat(new Solution().maxValidSplits(new int[] {5}), equalTo(0));
    }
}

