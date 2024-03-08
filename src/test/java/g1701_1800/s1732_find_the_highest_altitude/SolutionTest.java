package g1701_1800.s1732_find_the_highest_altitude;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestAltitude() {
        assertThat(new Solution().largestAltitude(new int[] {-5, 1, 5, 0, -7}), equalTo(1));
    }

    @Test
    void largestAltitude2() {
        assertThat(new Solution().largestAltitude(new int[] {-4, -3, -2, -1, 4, 3, 2}), equalTo(0));
    }
}
