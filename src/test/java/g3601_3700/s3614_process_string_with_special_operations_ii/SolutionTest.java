package g3601_3700.s3614_process_string_with_special_operations_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void processStr() {
        assertThat(new Solution().processStr("a#b%*", 1), equalTo('a'));
    }

    @Test
    void processStr2() {
        assertThat(new Solution().processStr("cd%#*#", 3), equalTo('d'));
    }

    @Test
    void processStr3() {
        assertThat(new Solution().processStr("z*#", 0), equalTo('.'));
    }
}
