package g3001_3100.s3043_find_the_length_of_the_longest_common_prefix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestCommonPrefix() {
        assertThat(
                new Solution().longestCommonPrefix(new int[] {1, 10, 100}, new int[] {1000}),
                equalTo(3));
    }

    @Test
    void longestCommonPrefix2() {
        assertThat(
                new Solution().longestCommonPrefix(new int[] {1, 2, 3}, new int[] {4, 4, 4}),
                equalTo(0));
    }
}
