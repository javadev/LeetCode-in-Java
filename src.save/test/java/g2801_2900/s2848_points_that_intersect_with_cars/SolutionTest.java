package g2801_2900.s2848_points_that_intersect_with_cars;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPoints() {
        assertThat(
                new Solution()
                        .numberOfPoints(
                                Arrays.asList(
                                        Arrays.asList(3, 6),
                                        Arrays.asList(1, 5),
                                        Arrays.asList(4, 7))),
                equalTo(7));
    }

    @Test
    void numberOfPoints2() {
        assertThat(
                new Solution()
                        .numberOfPoints(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(5, 8))),
                equalTo(7));
    }
}
