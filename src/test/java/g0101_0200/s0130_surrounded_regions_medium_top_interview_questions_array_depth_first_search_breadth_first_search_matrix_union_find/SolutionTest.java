package g0101_0200.s0130_surrounded_regions_medium_top_interview_questions_array_depth_first_search_breadth_first_search_matrix_union_find;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void solve() {
        char[][] board =
                new char[][] {
                    {'X', 'X', 'X', 'X'},
                    {'X', 'O', 'O', 'X'},
                    {'X', 'X', 'O', 'X'},
                    {'X', 'O', 'X', 'X'}
                };
        new Solution().solve(board);
        assertThat(
                board,
                equalTo(
                        new char[][] {
                            {'X', 'X', 'X', 'X'},
                            {'X', 'X', 'X', 'X'},
                            {'X', 'X', 'X', 'X'},
                            {'X', 'O', 'X', 'X'}
                        }));
    }
}
