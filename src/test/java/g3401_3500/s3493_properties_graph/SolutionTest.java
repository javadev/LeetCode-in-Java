package g3401_3500.s3493_properties_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfComponents() {
        assertThat(
                new Solution()
                        .numberOfComponents(
                                new int[][] {{1, 2}, {1, 1}, {3, 4}, {4, 5}, {5, 6}, {7, 7}}, 1),
                equalTo(3));
    }

    @Test
    void numberOfComponents2() {
        assertThat(
                new Solution().numberOfComponents(new int[][] {{1, 2, 3}, {2, 3, 4}, {4, 3, 5}}, 2),
                equalTo(1));
    }

    @Test
    void numberOfComponents3() {
        assertThat(new Solution().numberOfComponents(new int[][] {{1, 1}, {1, 1}}, 2), equalTo(2));
    }
}
