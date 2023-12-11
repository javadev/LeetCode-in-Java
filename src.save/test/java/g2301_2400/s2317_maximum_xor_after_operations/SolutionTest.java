package g2301_2400.s2317_maximum_xor_after_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumXOR() {
        assertThat(new Solution().maximumXOR(new int[] {3, 2, 4, 6}), equalTo(7));
    }

    @Test
    void maximumXOR2() {
        assertThat(new Solution().maximumXOR(new int[] {1, 2, 3, 9, 2}), equalTo(11));
    }
}
