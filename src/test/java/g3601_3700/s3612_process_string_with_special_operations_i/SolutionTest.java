package g3601_3700.s3612_process_string_with_special_operations_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void processStr() {
        assertThat(new Solution().processStr("a#b%*"), equalTo("ba"));
    }

    @Test
    void processStr2() {
        assertThat(new Solution().processStr("z*#"), equalTo(""));
    }
}
