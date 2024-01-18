package g1901_2000.s1915_number_of_wonderful_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wonderfulSubstrings() {
        assertThat(new Solution().wonderfulSubstrings("aba"), equalTo(4L));
    }

    @Test
    void wonderfulSubstrings2() {
        assertThat(new Solution().wonderfulSubstrings("aabb"), equalTo(9L));
    }

    @Test
    void wonderfulSubstrings3() {
        assertThat(new Solution().wonderfulSubstrings("he"), equalTo(2L));
    }
}
