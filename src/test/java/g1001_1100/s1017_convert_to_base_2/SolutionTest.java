package g1001_1100.s1017_convert_to_base_2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void baseNeg2() {
        assertThat(new Solution().baseNeg2(2), equalTo("110"));
    }

    @Test
    void baseNeg22() {
        assertThat(new Solution().baseNeg2(3), equalTo("111"));
    }

    @Test
    void baseNeg23() {
        assertThat(new Solution().baseNeg2(4), equalTo("100"));
    }
}
