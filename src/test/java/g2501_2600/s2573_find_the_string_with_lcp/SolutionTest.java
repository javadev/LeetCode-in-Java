package g2501_2600.s2573_find_the_string_with_lcp;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTheString() {
        assertThat(
                new Solution()
                        .findTheString(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[4,0,2,0],[0,3,0,1],[2,0,2,0],[0,1,0,1]")),
                equalTo("abab"));
    }

    @Test
    void findTheString2() {
        assertThat(
                new Solution()
                        .findTheString(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[4,3,2,1],[3,3,2,1],[2,2,2,1],[1,1,1,1]")),
                equalTo("aaaa"));
    }

    @Test
    void findTheString3() {
        assertThat(
                new Solution()
                        .findTheString(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[4,3,2,1],[3,3,2,1],[2,2,2,1],[1,1,1,3]")),
                equalTo(""));
    }
}
