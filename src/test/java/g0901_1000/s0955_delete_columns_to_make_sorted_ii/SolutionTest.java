package g0901_1000.s0955_delete_columns_to_make_sorted_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDeletionSize() {
        assertThat(new Solution().minDeletionSize(new String[] {"ca", "bb", "ac"}), equalTo(1));
    }

    @Test
    void minDeletionSize2() {
        assertThat(new Solution().minDeletionSize(new String[] {"xc", "yb", "za"}), equalTo(0));
    }

    @Test
    void minDeletionSize3() {
        assertThat(new Solution().minDeletionSize(new String[] {"zyx", "wvu", "tsr"}), equalTo(3));
    }
}
