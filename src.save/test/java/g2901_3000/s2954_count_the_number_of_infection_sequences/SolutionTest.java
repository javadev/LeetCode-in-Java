package g2901_3000.s2954_count_the_number_of_infection_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSequence() {
        assertThat(new Solution().numberOfSequence(5, new int[] {0, 4}), equalTo(4));
    }

    @Test
    void numberOfSequence2() {
        assertThat(new Solution().numberOfSequence(4, new int[] {1}), equalTo(3));
    }
}
