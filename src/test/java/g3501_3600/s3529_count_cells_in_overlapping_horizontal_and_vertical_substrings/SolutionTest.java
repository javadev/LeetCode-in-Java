package g3501_3600.s3529_count_cells_in_overlapping_horizontal_and_vertical_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCells() {
        assertThat(
                new Solution()
                        .countCells(
                                new char[][] {
                                    {'a', 'a', 'c', 'c'},
                                    {'b', 'b', 'b', 'c'},
                                    {'a', 'a', 'b', 'a'},
                                    {'c', 'a', 'a', 'c'},
                                    {'a', 'a', 'c', 'c'}
                                },
                                "abaca"),
                equalTo(1));
    }

    @Test
    void countCells2() {
        assertThat(
                new Solution()
                        .countCells(
                                new char[][] {
                                    {'c', 'a', 'a', 'a'},
                                    {'a', 'a', 'b', 'a'},
                                    {'b', 'b', 'a', 'a'},
                                    {'a', 'a', 'b', 'a'}
                                },
                                "aba"),
                equalTo(4));
    }

    @Test
    void countCells3() {
        assertThat(new Solution().countCells(new char[][] {{'a'}}, "a"), equalTo(1));
    }
}
