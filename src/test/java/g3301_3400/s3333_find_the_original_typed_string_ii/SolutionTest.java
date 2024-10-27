package g3301_3400.s3333_find_the_original_typed_string_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void possibleStringCount() {
        assertThat(new Solution().possibleStringCount("aabbccdd", 7), equalTo(5));
    }

    @Test
    void possibleStringCount2() {
        assertThat(new Solution().possibleStringCount("aabbccdd", 8), equalTo(1));
    }

    @Test
    void possibleStringCount3() {
        assertThat(new Solution().possibleStringCount("aaabbb", 3), equalTo(8));
    }
}
