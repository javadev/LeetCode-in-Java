package g3301_3400.s3330_find_the_original_typed_string_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void possibleStringCount() {
        assertThat(new Solution().possibleStringCount("abbcccc"), equalTo(5));
    }

    @Test
    void possibleStringCount2() {
        assertThat(new Solution().possibleStringCount("abcd"), equalTo(1));
    }

    @Test
    void possibleStringCount3() {
        assertThat(new Solution().possibleStringCount("aaaa"), equalTo(4));
    }
}
