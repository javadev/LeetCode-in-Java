package g2301_2400.s2350_shortest_impossible_sequence_of_rolls;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestSequence() {
        assertThat(
                new Solution().shortestSequence(new int[] {4, 2, 1, 2, 3, 3, 2, 4, 1}, 4),
                equalTo(3));
    }

    @Test
    void shortestSequence2() {
        assertThat(new Solution().shortestSequence(new int[] {1, 1, 2, 2}, 2), equalTo(2));
    }

    @Test
    void shortestSequence3() {
        assertThat(
                new Solution().shortestSequence(new int[] {1, 1, 3, 2, 2, 2, 3, 3}, 4), equalTo(1));
    }
}
