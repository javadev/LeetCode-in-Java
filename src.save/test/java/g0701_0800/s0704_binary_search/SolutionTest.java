package g0701_0800.s0704_binary_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void search() {
        assertThat(new Solution().search(new int[] {-1, 0, 3, 5, 9, 12}, 9), equalTo(4));
    }

    @Test
    void search2() {
        assertThat(new Solution().search(new int[] {-1, 0, 3, 5, 9, 12}, 2), equalTo(-1));
    }
}
