package g1701_1800.s1711_count_good_meals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(new int[] {1, 3, 5, 7, 9}), equalTo(4));
    }

    @Test
    void countPairs2() {
        assertThat(new Solution().countPairs(new int[] {1, 1, 1, 3, 3, 3, 7}), equalTo(15));
    }
}
