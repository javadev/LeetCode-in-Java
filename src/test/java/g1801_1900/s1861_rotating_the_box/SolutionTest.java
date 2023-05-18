package g1801_1900.s1861_rotating_the_box;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rotateTheBox() {
        assertThat(
                new Solution().rotateTheBox(new char[][] {{'#', '.', '#'}}),
                equalTo(new char[][] {{'.'}, {'#'}, {'#'}}));
    }

    @Test
    void rotateTheBox2() {
        assertThat(
                new Solution()
                        .rotateTheBox(new char[][] {{'#', '.', '*', '.'}, {'#', '#', '*', '.'}}),
                equalTo(new char[][] {{'#', '.'}, {'#', '#'}, {'*', '*'}, {'.', '.'}}));
    }

    @Test
    void rotateTheBox3() {
        assertThat(
                new Solution()
                        .rotateTheBox(
                                new char[][] {
                                    {'#', '#', '*', '.', '*', '.'},
                                    {'#', '#', '#', '*', '.', '.'},
                                    {'#', '#', '#', '.', '#', '.'}
                                }),
                equalTo(
                        new char[][] {
                            {'.', '#', '#'},
                            {'.', '#', '#'},
                            {'#', '#', '*'},
                            {'#', '*', '.'},
                            {'#', '.', '*'},
                            {'#', '.', '.'}
                        }));
    }
}
