package g3301_3400.s3310_remove_methods_from_project;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void remainingMethods() {
        assertThat(
                new Solution().remainingMethods(4, 1, new int[][] {{1, 2}, {0, 1}, {3, 2}}),
                equalTo(List.of(0, 1, 2, 3)));
    }

    @Test
    void remainingMethods2() {
        assertThat(
                new Solution().remainingMethods(5, 0, new int[][] {{1, 2}, {0, 2}, {0, 1}, {3, 4}}),
                equalTo(List.of(3, 4)));
    }

    @Test
    void remainingMethods3() {
        assertThat(
                new Solution().remainingMethods(3, 2, new int[][] {{1, 2}, {0, 1}, {2, 0}}),
                equalTo(List.of()));
    }
}
