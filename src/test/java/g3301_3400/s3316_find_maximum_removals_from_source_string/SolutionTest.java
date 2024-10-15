package g3301_3400.s3316_find_maximum_removals_from_source_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxRemovals() {
        assertThat(new Solution().maxRemovals("abbaa", "aba", new int[] {0, 1, 2}), equalTo(1));
    }

    @Test
    void maxRemovals2() {
        assertThat(new Solution().maxRemovals("bcda", "d", new int[] {0, 3}), equalTo(2));
    }

    @Test
    void maxRemovals3() {
        assertThat(new Solution().maxRemovals("dda", "dda", new int[] {0, 1, 2}), equalTo(0));
    }

    @Test
    void maxRemovals4() {
        assertThat(
                new Solution().maxRemovals("yeyeykyded", "yeyyd", new int[] {0, 2, 3, 4}),
                equalTo(2));
    }
}
