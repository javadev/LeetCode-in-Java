package g1301_1400.s1383_maximum_performance_of_a_team;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPerformance() {
        assertThat(
                new Solution()
                        .maxPerformance(
                                6, new int[] {2, 10, 3, 1, 5, 8}, new int[] {5, 4, 3, 9, 7, 2}, 2),
                equalTo(60));
    }

    @Test
    void maxPerformance2() {
        assertThat(
                new Solution()
                        .maxPerformance(
                                6, new int[] {2, 10, 3, 1, 5, 8}, new int[] {5, 4, 3, 9, 7, 2}, 3),
                equalTo(68));
    }

    @Test
    void maxPerformance3() {
        assertThat(
                new Solution()
                        .maxPerformance(
                                6, new int[] {2, 10, 3, 1, 5, 8}, new int[] {5, 4, 3, 9, 7, 2}, 4),
                equalTo(72));
    }
}
