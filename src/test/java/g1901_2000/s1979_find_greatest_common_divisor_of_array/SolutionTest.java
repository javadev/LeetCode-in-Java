package g1901_2000.s1979_find_greatest_common_divisor_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findGCD() {
        assertThat(new Solution().findGCD(new int[] {2, 5, 6, 9, 10}), equalTo(2));
    }

    @Test
    void findGCD2() {
        assertThat(new Solution().findGCD(new int[] {7, 5, 6, 8, 3}), equalTo(1));
    }

    @Test
    void findGCD3() {
        assertThat(new Solution().findGCD(new int[] {3, 3}), equalTo(3));
    }
}
