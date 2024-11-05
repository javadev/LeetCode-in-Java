package g3301_3400.s3340_check_balanced_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isBalanced() {
        assertThat(new Solution().isBalanced("1234"), equalTo(false));
    }

    @Test
    void isBalanced2() {
        assertThat(new Solution().isBalanced("24123"), equalTo(true));
    }
}
