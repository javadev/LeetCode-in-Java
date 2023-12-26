package g2901_3000.s2904_shortest_and_lexicographically_smallest_beautiful_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestBeautifulSubstring() {
        assertThat(new Solution().shortestBeautifulSubstring("100011001", 3), equalTo("11001"));
    }

    @Test
    void shortestBeautifulSubstring2() {
        assertThat(new Solution().shortestBeautifulSubstring("1011", 2), equalTo("11"));
    }

    @Test
    void shortestBeautifulSubstring3() {
        assertThat(new Solution().shortestBeautifulSubstring("000", 1), equalTo(""));
    }

    @Test
    void shortestBeautifulSubstring4() {
        assertThat(
                new Solution().shortestBeautifulSubstring("001110101101101111", 10),
                equalTo("10101101101111"));
    }
}
