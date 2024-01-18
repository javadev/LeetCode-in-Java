package g0701_0800.s0757_set_intersection_size_at_least_two;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void intersectionSizeTwo() {
        assertThat(
                new Solution().intersectionSizeTwo(new int[][] {{1, 3}, {1, 4}, {2, 5}, {3, 5}}),
                equalTo(3));
    }

    @Test
    void intersectionSizeTwo2() {
        assertThat(
                new Solution().intersectionSizeTwo(new int[][] {{1, 2}, {2, 3}, {2, 4}, {4, 5}}),
                equalTo(5));
    }
}
