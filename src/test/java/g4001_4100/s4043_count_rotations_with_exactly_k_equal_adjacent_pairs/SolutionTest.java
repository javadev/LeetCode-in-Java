package g4001_4100.s4043_count_rotations_with_exactly_k_equal_adjacent_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countRotations() {
        assertThat(new Solution().countRotations("aaaa", 4), equalTo(0));
    }

    @Test
    void countRotations2() {
        assertThat(new Solution().countRotations("aaaa", 3), equalTo(4));
    }

    @Test
    void countRotations3() {
        assertThat(new Solution().countRotations("abab", 0), equalTo(4));
    }

    @Test
    void countRotations4() {
        assertThat(new Solution().countRotations("abab", 1), equalTo(0));
    }
}

