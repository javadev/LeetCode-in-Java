package g0801_0900.s0821_shortest_distance_to_a_character;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestToChar() {
        assertThat(
                new Solution().shortestToChar("loveleetcode", 'e'),
                equalTo(new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}));
    }

    @Test
    void shortestToChar2() {
        assertThat(new Solution().shortestToChar("aaab", 'b'), equalTo(new int[] {3, 2, 1, 0}));
    }
}
