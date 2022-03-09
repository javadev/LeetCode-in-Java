package g1201_1300.s1207_unique_number_of_occurrences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniqueOccurrences() {
        assertThat(new Solution().uniqueOccurrences(new int[] {1, 2, 2, 1, 1, 3}), equalTo(true));
    }

    @Test
    void uniqueOccurrences2() {
        assertThat(new Solution().uniqueOccurrences(new int[] {1, 2}), equalTo(false));
    }

    @Test
    void uniqueOccurrences3() {
        assertThat(
                new Solution().uniqueOccurrences(new int[] {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}),
                equalTo(true));
    }
}
