package g2801_2900.s2894_divisible_and_non_divisible_sums_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void differenceOfSums() {
        assertThat(new Solution().differenceOfSums(10, 3), equalTo(19));
    }

    @Test
    void differenceOfSums2() {
        assertThat(new Solution().differenceOfSums(5, 6), equalTo(15));
    }

    @Test
    void differenceOfSums3() {
        assertThat(new Solution().differenceOfSums(5, 1), equalTo(-15));
    }
}
