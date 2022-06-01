package g2201_2300.s2246_longest_path_with_different_adjacent_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPath() {
        assertThat(new Solution().longestPath(new int[] {-1, 0, 0, 1, 1, 2}, "abacbe"), equalTo(3));
    }

    @Test
    void longestPath2() {
        assertThat(new Solution().longestPath(new int[] {-1, 0, 0, 0}, "aabc"), equalTo(3));
    }
}
