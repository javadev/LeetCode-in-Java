package g1301_1400.s1385_find_the_distance_value_between_two_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTheDistanceValue() {
        assertThat(
                new Solution()
                        .findTheDistanceValue(new int[] {4, 5, 8}, new int[] {10, 9, 1, 8}, 2),
                equalTo(2));
    }

    @Test
    void findTheDistanceValue2() {
        assertThat(
                new Solution()
                        .findTheDistanceValue(
                                new int[] {1, 4, 2, 3}, new int[] {-4, -3, 6, 10, 20, 30}, 3),
                equalTo(2));
    }

    @Test
    void findTheDistanceValue3() {
        assertThat(
                new Solution()
                        .findTheDistanceValue(
                                new int[] {2, 1, 100, 3}, new int[] {-5, -2, 10, -3, 7}, 6),
                equalTo(1));
    }
}
