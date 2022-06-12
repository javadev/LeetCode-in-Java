package g2201_2300.s2208_minimum_operations_to_halve_array_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void halveArray() {
        assertThat(new Solution().halveArray(new int[] {5, 19, 8, 1}), equalTo(3));
    }

    @Test
    void halveArray2() {
        assertThat(new Solution().halveArray(new int[] {3, 8, 20}), equalTo(3));
    }
}
