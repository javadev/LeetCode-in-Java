package g3401_3500.s3488_closest_equal_element_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solveQueries() {
        assertThat(
                new Solution().solveQueries(new int[] {1, 3, 1, 4, 1, 3, 2}, new int[] {0, 3, 5}),
                equalTo(List.of(2, -1, 3)));
    }

    @Test
    void solveQueries2() {
        assertThat(
                new Solution().solveQueries(new int[] {1, 2, 3, 4}, new int[] {0, 1, 2, 3}),
                equalTo(List.of(-1, -1, -1, -1)));
    }
}
