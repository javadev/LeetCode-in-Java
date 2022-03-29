package g1401_1500.s1467_probability_of_a_two_boxes_having_the_same_number_of_distinct_balls;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getProbability() {
        assertThat(new Solution().getProbability(new int[] {1, 1}), equalTo(1.00000));
    }

    @Test
    void getProbability2() {
        assertThat(new Solution().getProbability(new int[] {2, 1, 1}), equalTo(0.6666666666666666));
    }

    @Test
    void getProbability3() {
        assertThat(new Solution().getProbability(new int[] {1, 2, 1, 2}), equalTo(0.60000));
    }
}
