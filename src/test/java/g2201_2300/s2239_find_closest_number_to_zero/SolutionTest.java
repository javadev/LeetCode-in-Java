package g2201_2300.s2239_find_closest_number_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findClosestNumber() {
        assertThat(new Solution().findClosestNumber(new int[] {-4, -2, 1, 4, 8}), equalTo(1));
    }

    @Test
    void findClosestNumber2() {
        assertThat(new Solution().findClosestNumber(new int[] {2, -1, 1}), equalTo(1));
    }
}
