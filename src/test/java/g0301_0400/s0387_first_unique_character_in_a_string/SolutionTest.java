package g0301_0400.s0387_first_unique_character_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstUniqChar() {
        assertThat(new Solution().firstUniqChar("leetcode"), equalTo(0));
    }

    @Test
    void firstUniqChar2() {
        assertThat(new Solution().firstUniqChar("loveleetcode"), equalTo(2));
    }

    @Test
    void firstUniqChar3() {
        assertThat(new Solution().firstUniqChar("aabb"), equalTo(-1));
    }
}
