package g3201_3300.s3245_alternating_groups_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfAlternatingGroups() {
        assertThat(
                new Solution()
                        .numberOfAlternatingGroups(
                                new int[] {0, 1, 1, 0, 1}, new int[][] {{2, 1, 0}, {1, 4}}),
                equalTo(List.of(2)));
    }

    @Test
    void numberOfAlternatingGroups2() {
        assertThat(
                new Solution()
                        .numberOfAlternatingGroups(
                                new int[] {0, 0, 1, 0, 1, 1},
                                new int[][] {{1, 3}, {2, 3, 0}, {1, 5}}),
                equalTo(List.of(2, 0)));
    }
}
