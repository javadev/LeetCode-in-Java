package g1601_1700.s1611_minimum_one_bit_operations_to_make_integers_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOneBitOperations() {
        assertThat(new Solution().minimumOneBitOperations(3), equalTo(2));
    }

    @Test
    void minimumOneBitOperations2() {
        assertThat(new Solution().minimumOneBitOperations(6), equalTo(4));
    }
}
