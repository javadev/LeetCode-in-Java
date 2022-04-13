package g1601_1700.s1610_maximum_number_of_visible_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void visiblePoints() {
        assertThat(
                new Solution()
                        .visiblePoints(
                                Arrays.asList(
                                        Arrays.asList(2, 1),
                                        Arrays.asList(2, 2),
                                        Arrays.asList(2, 3)),
                                90,
                                Arrays.asList(1, 1)),
                equalTo(3));
    }

    @Test
    void visiblePoints2() {
        assertThat(
                new Solution()
                        .visiblePoints(
                                Arrays.asList(
                                        Arrays.asList(2, 1),
                                        Arrays.asList(2, 2),
                                        Arrays.asList(3, 4),
                                        Arrays.asList(1, 1)),
                                90,
                                Arrays.asList(1, 1)),
                equalTo(4));
    }

    @Test
    void visiblePoints3() {
        assertThat(
                new Solution()
                        .visiblePoints(
                                Arrays.asList(Arrays.asList(1, 0), Arrays.asList(2, 1)),
                                13,
                                Arrays.asList(1, 1)),
                equalTo(1));
    }
}
