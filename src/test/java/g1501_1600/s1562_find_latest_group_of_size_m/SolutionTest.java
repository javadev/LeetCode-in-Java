package g1501_1600.s1562_find_latest_group_of_size_m;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLatestStep() {
        assertThat(new Solution().findLatestStep(new int[] {3, 5, 1, 2, 4}, 1), equalTo(4));
    }

    @Test
    void findLatestStep2() {
        assertThat(new Solution().findLatestStep(new int[] {3, 1, 5, 4, 2}, 2), equalTo(-1));
    }
}
