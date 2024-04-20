package g2201_2300.s2206_divide_array_into_equal_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void divideArray() {
        assertThat(new Solution().divideArray(new int[] {3, 2, 3, 2, 2, 2}), equalTo(true));
    }

    @Test
    void divideArray2() {
        assertThat(new Solution().divideArray(new int[] {1, 2, 3, 4}), equalTo(false));
    }
}
