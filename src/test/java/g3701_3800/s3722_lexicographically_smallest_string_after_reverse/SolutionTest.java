package g3701_3800.s3722_lexicographically_smallest_string_after_reverse;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexSmallest() {
        assertThat(new Solution().lexSmallest("dcab"), equalTo("acdb"));
    }

    @Test
    void lexSmallest2() {
        assertThat(new Solution().lexSmallest("abba"), equalTo("aabb"));
    }

    @Test
    void lexSmallest3() {
        assertThat(new Solution().lexSmallest("zxy"), equalTo("xzy"));
    }
}
