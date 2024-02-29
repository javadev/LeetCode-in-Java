package g3001_3100.s3046_split_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPossibleToSplit() {
        assertThat(new Solution().isPossibleToSplit(new int[] {1, 1, 2, 2, 3, 4}), equalTo(true));
    }

    @Test
    void isPossibleToSplit2() {
        assertThat(new Solution().isPossibleToSplit(new int[] {1, 1, 1, 1}), equalTo(false));
    }
}
