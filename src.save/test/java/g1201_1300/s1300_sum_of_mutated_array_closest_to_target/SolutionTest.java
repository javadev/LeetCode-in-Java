package g1201_1300.s1300_sum_of_mutated_array_closest_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findBestValue() {
        assertThat(new Solution().findBestValue(new int[] {4, 9, 3}, 10), equalTo(3));
    }

    @Test
    void findBestValue2() {
        assertThat(new Solution().findBestValue(new int[] {2, 3, 5}, 10), equalTo(5));
    }
}
