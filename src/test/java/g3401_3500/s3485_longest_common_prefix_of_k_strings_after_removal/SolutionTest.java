package g3401_3500.s3485_longest_common_prefix_of_k_strings_after_removal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestCommonPrefix() {
        assertThat(
                new Solution()
                        .longestCommonPrefix(new String[] {"jump", "run", "run", "jump", "run"}, 2),
                equalTo(new int[] {3, 4, 4, 3, 4}));
    }

    @Test
    void longestCommonPrefix2() {
        assertThat(
                new Solution().longestCommonPrefix(new String[] {"dog", "racer", "car"}, 2),
                equalTo(new int[] {0, 0, 0}));
    }

    @Test
    void longestCommonPrefix3() {
        assertThat(
                new Solution().longestCommonPrefix(new String[] {"cdbff"}, 1),
                equalTo(new int[] {0}));
    }
}
