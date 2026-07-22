package g3801_3900.s3850_count_sequences_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSequences() {
        assertThat(new Solution().countSequences(new int[] {2, 3, 2}, 6), equalTo(2));
    }

    @Test
    void countSequences2() {
        assertThat(new Solution().countSequences(new int[] {4, 6, 3}, 2), equalTo(2));
    }

    @Test
    void countSequences3() {
        assertThat(new Solution().countSequences(new int[] {1, 5}, 1), equalTo(3));
    }
}
