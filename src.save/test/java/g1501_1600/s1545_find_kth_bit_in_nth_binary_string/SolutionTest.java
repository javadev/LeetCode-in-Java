package g1501_1600.s1545_find_kth_bit_in_nth_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKthBit() {
        assertThat(new Solution().findKthBit(3, 1), equalTo('0'));
    }

    @Test
    void findKthBit2() {
        assertThat(new Solution().findKthBit(4, 11), equalTo('1'));
    }
}
