package g0901_1000.s0960_delete_columns_to_make_sorted_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDeletionSize() {
        assertThat(new Solution().minDeletionSize(new String[] {"babca", "bbazb"}), equalTo(3));
    }

    @Test
    void minDeletionSize2() {
        assertThat(new Solution().minDeletionSize(new String[] {"edcba"}), equalTo(4));
    }

    @Test
    void minDeletionSize3() {
        assertThat(new Solution().minDeletionSize(new String[] {"ghi", "def", "abc"}), equalTo(0));
    }
}
