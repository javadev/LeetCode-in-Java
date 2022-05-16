package g1901_2000.s1996_the_number_of_weak_characters_in_the_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfWeakCharacters() {
        assertThat(
                new Solution().numberOfWeakCharacters(new int[][] {{5, 5}, {6, 3}, {3, 6}}),
                equalTo(0));
    }

    @Test
    void numberOfWeakCharacters2() {
        assertThat(new Solution().numberOfWeakCharacters(new int[][] {{2, 2}, {3, 3}}), equalTo(1));
    }

    @Test
    void numberOfWeakCharacters3() {
        assertThat(
                new Solution().numberOfWeakCharacters(new int[][] {{1, 5}, {10, 4}, {4, 3}}),
                equalTo(1));
    }
}
