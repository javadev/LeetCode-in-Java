package g2501_2600.s2559_count_vowel_strings_in_ranges;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void vowelStrings() {
        assertThat(
                new Solution()
                        .vowelStrings(
                                new String[] {"aba", "bcb", "ece", "aa", "e"},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,2],[1,4],[1,1]")),
                equalTo(new int[] {2, 3, 0}));
    }

    @Test
    void vowelStrings2() {
        assertThat(
                new Solution()
                        .vowelStrings(
                                new String[] {"a", "e", "i"},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,2],[0,1],[2,2]")),
                equalTo(new int[] {3, 2, 1}));
    }
}
