package g0901_1000.s0943_find_the_shortest_superstring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestSuperstring() {
        assertThat(
                new Solution().shortestSuperstring(new String[] {"alex", "loves", "leetcode"}),
                equalTo("alexlovesleetcode"));
    }

    @Test
    void shortestSuperstring2() {
        assertThat(
                new Solution()
                        .shortestSuperstring(
                                new String[] {"catg", "ctaagt", "gcta", "ttca", "atgcatc"}),
                equalTo("gctaagttcatgcatc"));
    }
}
