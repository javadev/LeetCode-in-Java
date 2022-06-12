package g2201_2300.s2213_longest_substring_of_one_repeating_character;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestRepeating() {
        assertThat(
                new Solution().longestRepeating("babacc", "bcb", new int[] {1, 3, 3}),
                equalTo(new int[] {3, 3, 4}));
    }

    @Test
    void longestRepeating2() {
        assertThat(
                new Solution().longestRepeating("abyzz", "aa", new int[] {2, 1}),
                equalTo(new int[] {2, 3}));
    }
}
