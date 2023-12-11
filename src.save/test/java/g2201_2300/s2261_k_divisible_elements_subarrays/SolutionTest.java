package g2201_2300.s2261_k_divisible_elements_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDistinct() {
        assertThat(new Solution().countDistinct(new int[] {2, 3, 3, 2, 2}, 2, 2), equalTo(11));
    }

    @Test
    void countDistinct2() {
        assertThat(new Solution().countDistinct(new int[] {1, 2, 3, 4}, 4, 1), equalTo(10));
    }
}
