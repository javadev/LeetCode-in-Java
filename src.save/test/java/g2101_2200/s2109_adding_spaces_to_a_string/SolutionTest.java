package g2101_2200.s2109_adding_spaces_to_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addSpaces() {
        assertThat(
                new Solution().addSpaces("LeetcodeHelpsMeLearn", new int[] {8, 13, 15}),
                equalTo("Leetcode Helps Me Learn"));
    }

    @Test
    void addSpaces2() {
        assertThat(
                new Solution().addSpaces("icodeinpython", new int[] {1, 5, 7, 9}),
                equalTo("i code in py thon"));
    }

    @Test
    void addSpaces3() {
        assertThat(
                new Solution().addSpaces("spacing", new int[] {0, 1, 2, 3, 4, 5, 6}),
                equalTo(" s p a c i n g"));
    }
}
