package g1301_1400.s1365_how_many_numbers_are_smaller_than_the_current_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallerNumbersThanCurrent() {
        assertThat(
                new Solution().smallerNumbersThanCurrent(new int[] {8, 1, 2, 2, 3}),
                equalTo(new int[] {4, 0, 1, 1, 3}));
    }

    @Test
    void smallerNumbersThanCurrent2() {
        assertThat(
                new Solution().smallerNumbersThanCurrent(new int[] {6, 5, 4, 8}),
                equalTo(new int[] {2, 1, 0, 3}));
    }

    @Test
    void smallerNumbersThanCurrent3() {
        assertThat(
                new Solution().smallerNumbersThanCurrent(new int[] {7, 7, 7, 7}),
                equalTo(new int[] {0, 0, 0, 0}));
    }
}
