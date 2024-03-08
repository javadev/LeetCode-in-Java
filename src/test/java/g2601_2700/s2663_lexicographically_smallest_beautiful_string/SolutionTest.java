package g2601_2700.s2663_lexicographically_smallest_beautiful_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestBeautifulString() {
        assertThat(new Solution().smallestBeautifulString("abcz", 26), equalTo("abda"));
    }

    @Test
    void smallestBeautifulString2() {
        assertThat(new Solution().smallestBeautifulString("dc", 4), equalTo(""));
    }
}
