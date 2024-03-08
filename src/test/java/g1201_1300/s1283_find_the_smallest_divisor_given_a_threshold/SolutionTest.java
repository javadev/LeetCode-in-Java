package g1201_1300.s1283_find_the_smallest_divisor_given_a_threshold;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestDivisor() {
        assertThat(new Solution().smallestDivisor(new int[] {1, 2, 5, 9}, 6), equalTo(5));
    }

    @Test
    void smallestDivisor2() {
        assertThat(new Solution().smallestDivisor(new int[] {44, 22, 33, 11, 1}, 5), equalTo(44));
    }
}
