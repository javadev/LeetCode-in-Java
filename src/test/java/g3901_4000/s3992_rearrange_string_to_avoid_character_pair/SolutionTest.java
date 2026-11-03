package g3901_4000.s3992_rearrange_string_to_avoid_character_pair;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rearrangeString() {
        assertThat(new Solution().rearrangeString("aabc", 'a', 'c'), equalTo("caba"));
    }

    @Test
    void rearrangeString2() {
        assertThat(new Solution().rearrangeString("dcab", 'd', 'b'), equalTo("bcad"));
    }

    @Test
    void rearrangeString3() {
        assertThat(new Solution().rearrangeString("axe", 'o', 'x'), equalTo("xae"));
    }
}
