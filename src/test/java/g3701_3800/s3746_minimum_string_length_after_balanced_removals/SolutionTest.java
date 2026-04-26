package g3701_3800.s3746_minimum_string_length_after_balanced_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minLengthAfterRemovals() {
        assertThat(new Solution().minLengthAfterRemovals("ab"), equalTo(0));
    }

    @Test
    void minLengthAfterRemovals2() {
        assertThat(new Solution().minLengthAfterRemovals("aaab"), equalTo(2));
    }

    @Test
    void minLengthAfterRemovals3() {
        assertThat(new Solution().minLengthAfterRemovals("bbbb"), equalTo(4));
    }
}
