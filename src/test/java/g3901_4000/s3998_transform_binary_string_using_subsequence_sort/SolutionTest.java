package g3901_4000.s3998_transform_binary_string_using_subsequence_sort;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void transformStr() {
        assertThat(
                new Solution().transformStr("101", new String[] {"1?1", "0?1", "0?0"}),
                equalTo(new boolean[] {true, true, false}));
    }

    @Test
    void transformStr2() {
        assertThat(
                new Solution().transformStr("1100", new String[] {"0011", "11?1", "1?1?"}),
                equalTo(new boolean[] {true, false, true}));
    }

    @Test
    void transformStr3() {
        assertThat(
                new Solution().transformStr("1010", new String[] {"0011"}),
                equalTo(new boolean[] {true}));
    }
}
