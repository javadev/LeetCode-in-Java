package g0101_0200.s0165_compare_version_numbers_medium_string_two_pointers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void compareVersion() {

        assertThat(new Solution().compareVersion("1.01", "1.001"), equalTo(0));
    }
}
