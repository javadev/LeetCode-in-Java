package g3101_3200.s3123_find_edges_in_shortest_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findAnswer() {
        assertThat(
                new Solution()
                        .findAnswer(
                                6,
                                new int[][] {
                                    {0, 1, 4}, {0, 2, 1}, {1, 3, 2}, {1, 4, 3}, {1, 5, 1},
                                    {2, 3, 1}, {3, 5, 3}, {4, 5, 2}
                                }),
                equalTo(new boolean[] {true, true, true, false, true, true, true, false}));
    }

    @Test
    void findAnswer2() {
        assertThat(
                new Solution()
                        .findAnswer(4, new int[][] {{2, 0, 1}, {0, 1, 1}, {0, 3, 4}, {3, 2, 2}}),
                equalTo(new boolean[] {true, false, false, true}));
    }
}
