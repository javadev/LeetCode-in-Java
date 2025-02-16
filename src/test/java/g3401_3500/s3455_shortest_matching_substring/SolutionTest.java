package g3401_3500.s3455_shortest_matching_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestMatchingSubstring() {
        assertThat(
                new Solution().shortestMatchingSubstring("abaacbaecebce", "ba*c*ce"), equalTo(8));
    }

    @Test
    void shortestMatchingSubstring2() {
        assertThat(
                new Solution().shortestMatchingSubstring("baccbaadbc", "cc*baa*adb"), equalTo(-1));
    }

    @Test
    void shortestMatchingSubstring3() {
        assertThat(new Solution().shortestMatchingSubstring("a", "**"), equalTo(0));
    }

    @Test
    void shortestMatchingSubstring4() {
        assertThat(new Solution().shortestMatchingSubstring("madlogic", "*adlogi*"), equalTo(6));
    }
}
