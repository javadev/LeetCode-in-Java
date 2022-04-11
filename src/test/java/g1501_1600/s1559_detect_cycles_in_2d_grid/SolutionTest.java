package g1501_1600.s1559_detect_cycles_in_2d_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void containsCycle() {
        assertThat(
                new Solution()
                        .containsCycle(
                                new char[][] {
                                    {'a', 'a', 'a', 'a'},
                                    {'a', 'b', 'b', 'a'},
                                    {'a', 'b', 'b', 'a'},
                                    {'a', 'a', 'a', 'a'}
                                }),
                equalTo(true));
    }

    @Test
    void containsCycle2() {
        assertThat(
                new Solution()
                        .containsCycle(
                                new char[][] {
                                    {'c', 'c', 'c', 'a'},
                                    {'c', 'd', 'c', 'c'},
                                    {'c', 'c', 'e', 'c'},
                                    {'f', 'c', 'c', 'c'}
                                }),
                equalTo(true));
    }

    @Test
    void containsCycle3() {
        assertThat(
                new Solution()
                        .containsCycle(
                                new char[][] {{'a', 'b', 'b'}, {'b', 'z', 'b'}, {'b', 'b', 'a'}}),
                equalTo(false));
    }
}
