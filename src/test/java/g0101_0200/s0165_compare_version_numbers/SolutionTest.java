package g0101_0200.s0165_compare_version_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void compareVersion() {

        assertThat(new Solution().compareVersion("1.01", "1.001"), equalTo(0));
    }
}
