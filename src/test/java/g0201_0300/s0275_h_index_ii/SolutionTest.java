package g0201_0300.s0275_h_index_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hindex() {
        assertThat(new Solution().hindex(new int[] {0, 1, 3, 5, 6}), equalTo(3));
    }
}
