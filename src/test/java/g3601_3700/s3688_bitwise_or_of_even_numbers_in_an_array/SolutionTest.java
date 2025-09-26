package g3601_3700.s3688_bitwise_or_of_even_numbers_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void evenNumberBitwiseORs() {
        assertThat(new Solution().evenNumberBitwiseORs(new int[] {1, 2, 3, 4, 5, 6}), equalTo(6));
    }

    @Test
    void evenNumberBitwiseORs2() {
        assertThat(new Solution().evenNumberBitwiseORs(new int[] {7, 9, 11}), equalTo(0));
    }
}
