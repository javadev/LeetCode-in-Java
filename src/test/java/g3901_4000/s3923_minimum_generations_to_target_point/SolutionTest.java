package g3901_4000.s3923_minimum_generations_to_target_point;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minGenerations() {
        assertThat(
                new Solution()
                        .minGenerations(new int[][] {{0, 0, 0}, {6, 6, 6}}, new int[] {3, 3, 3}),
                equalTo(1));
    }

    @Test
    void minGenerations2() {
        assertThat(
                new Solution()
                        .minGenerations(new int[][] {{0, 0, 0}, {5, 5, 5}}, new int[] {1, 1, 1}),
                equalTo(2));
    }

    @Test
    void minGenerations3() {
        assertThat(
                new Solution()
                        .minGenerations(
                                new int[][] {{0, 0, 0}, {2, 2, 2}, {3, 3, 3}}, new int[] {2, 2, 2}),
                equalTo(0));
    }

    @Test
    void minGenerations4() {
        assertThat(
                new Solution().minGenerations(new int[][] {{1, 2, 3}}, new int[] {5, 5, 5}),
                equalTo(-1));
    }

    @Test
    void minGenerations5() {
        assertThat(
                new Solution()
                        .minGenerations(new int[][] {{0, 0, 0}, {6, 6, 6}}, new int[] {1, 2, 3}),
                equalTo(-1));
    }

    @Test
    void minGenerations6() {
        assertThat(
                new Solution()
                        .minGenerations(new int[][] {{0, 2, 4}, {5, 3, 1}}, new int[] {2, 2, 2}),
                equalTo(1));
    }
}
