package g2001_2100.s2018_check_if_word_can_be_placed_in_crossword;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void placeWordInCrossword() {
        assertThat(
                new Solution()
                        .placeWordInCrossword(
                                new char[][] {{'#', ' ', '#'}, {' ', ' ', '#'}, {'#', 'c', ' '}},
                                "abc"),
                equalTo(true));
    }

    @Test
    void placeWordInCrossword2() {
        assertThat(
                new Solution()
                        .placeWordInCrossword(
                                new char[][] {{' ', '#', 'a'}, {' ', '#', 'c'}, {' ', '#', 'a'}},
                                "ac"),
                equalTo(false));
    }

    @Test
    void placeWordInCrossword3() {
        assertThat(
                new Solution()
                        .placeWordInCrossword(
                                new char[][] {{'#', ' ', '#'}, {' ', ' ', '#'}, {'#', ' ', 'c'}},
                                "ca"),
                equalTo(true));
    }
}
