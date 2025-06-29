package g3501_3600.s3598_longest_common_prefix_between_adjacent_strings_after_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestCommonPrefix() {
        assertThat(
                new Solution()
                        .longestCommonPrefix(new String[] {"jump", "run", "run", "jump", "run"}),
                equalTo(new int[] {3, 0, 0, 3, 3}));
    }

    @Test
    void longestCommonPrefix2() {
        assertThat(
                new Solution().longestCommonPrefix(new String[] {"dog", "racer", "car"}),
                equalTo(new int[] {0, 0, 0}));
    }
}
