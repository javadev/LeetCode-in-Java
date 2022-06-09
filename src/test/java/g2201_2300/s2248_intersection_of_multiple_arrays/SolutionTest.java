package g2201_2300.s2248_intersection_of_multiple_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void intersection() {
        assertThat(
                new Solution()
                        .intersection(new int[][] {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}),
                equalTo(Arrays.asList(3, 4)));
    }

    @Test
    void intersection2() {
        assertThat(
                new Solution().intersection(new int[][] {{1, 2, 3}, {4, 5, 6}}),
                equalTo(Arrays.asList()));
    }
}
