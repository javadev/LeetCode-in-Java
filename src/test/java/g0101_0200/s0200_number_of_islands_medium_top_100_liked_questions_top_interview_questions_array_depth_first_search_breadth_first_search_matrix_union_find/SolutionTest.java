package g0101_0200.s0200_number_of_islands;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void numIslands() {
        assertThat(
                new Solution()
                        .numIslands(
                                new char[][] {
                                    {'1', '1', '1', '1', '0'},
                                    {'1', '1', '0', '1', '0'},
                                    {'1', '1', '0', '0', '0'},
                                    {'0', '0', '0', '0', '0'}
                                }),
                equalTo(1));
    }

    public void numIslands2() {
        assertThat(
                new Solution()
                        .numIslands(
                                new char[][] {
                                    {'1', '1', '0', '0', '0'},
                                    {'1', '1', '0', '0', '0'},
                                    {'0', '0', '1', '0', '0'},
                                    {'0', '0', '0', '1', '1'}
                                }),
                equalTo(3));
    }
}
