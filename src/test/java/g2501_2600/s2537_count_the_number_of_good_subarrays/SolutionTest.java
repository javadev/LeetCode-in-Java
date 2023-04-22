package g2501_2600.s2537_count_the_number_of_good_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGood() {
        assertThat(new Solution().countGood(new int[] {1, 1, 1, 1, 1}, 10), equalTo(1L));
    }

    @Test
    void countGood2() {
        assertThat(new Solution().countGood(new int[] {3, 1, 4, 3, 2, 2, 4}, 2), equalTo(4L));
    }
}
