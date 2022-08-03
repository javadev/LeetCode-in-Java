package g0201_0300.s0275_h_index_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hIndex() {
        assertThat(new Solution().hIndex(new int[] {0, 1, 3, 5, 6}), equalTo(3));
    }

    @Test
    void hIndex2() {
        assertThat(new Solution().hIndex(new int[] {1, 2, 100}), equalTo(2));
    }
}
