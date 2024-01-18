package g1001_1100.s1015_smallest_integer_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestRepunitDivByK() {
        assertThat(new Solution().smallestRepunitDivByK(1), equalTo(1));
    }

    @Test
    void smallestRepunitDivByK2() {
        assertThat(new Solution().smallestRepunitDivByK(2), equalTo(-1));
    }

    @Test
    void smallestRepunitDivByK3() {
        assertThat(new Solution().smallestRepunitDivByK(3), equalTo(3));
    }
}
