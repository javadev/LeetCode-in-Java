package g0901_1000.s0944_delete_columns_to_make_sorted;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDeletionSize() {
        assertThat(new Solution().minDeletionSize(new String[] {"cba", "daf", "ghi"}), equalTo(1));
    }

    @Test
    void minDeletionSize2() {
        assertThat(new Solution().minDeletionSize(new String[] {"a", "b"}), equalTo(0));
    }

    @Test
    void minDeletionSize3() {
        assertThat(new Solution().minDeletionSize(new String[] {"zyx", "wvu", "tsr"}), equalTo(3));
    }
}
