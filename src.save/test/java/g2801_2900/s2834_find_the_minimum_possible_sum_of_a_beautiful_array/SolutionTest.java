package g2801_2900.s2834_find_the_minimum_possible_sum_of_a_beautiful_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumPossibleSum() {
        assertThat(new Solution().minimumPossibleSum(2, 3), equalTo(4));
    }

    @Test
    void minimumPossibleSum2() {
        assertThat(new Solution().minimumPossibleSum(3, 3), equalTo(8));
    }

    @Test
    void minimumPossibleSum3() {
        assertThat(new Solution().minimumPossibleSum(1, 1), equalTo(1));
    }
}
