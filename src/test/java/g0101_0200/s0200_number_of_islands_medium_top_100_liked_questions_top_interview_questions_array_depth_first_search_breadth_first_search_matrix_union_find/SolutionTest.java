package g0101_0200.s0200_number_of_islands_medium_top_100_liked_questions_top_interview_questions_array_depth_first_search_breadth_first_search_matrix_union_find;

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
