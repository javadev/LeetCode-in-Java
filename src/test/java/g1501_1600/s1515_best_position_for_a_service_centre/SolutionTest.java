package g1501_1600.s1515_best_position_for_a_service_centre;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMinDistSum() {
        assertThat(
                new Solution().getMinDistSum(new int[][] {{0, 1}, {1, 0}, {1, 2}, {2, 1}}),
                equalTo(4.00));
    }

    @Test
    void getMinDistSum2() {
        assertThat(
                new Solution().getMinDistSum(new int[][] {{1, 1}, {3, 3}}),
                equalTo(2.82842712474619));
    }
}
