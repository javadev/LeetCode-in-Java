package g2101_2200.s2156_find_substring_with_given_hash_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subStrHash() {
        assertThat(new Solution().subStrHash("leetcode", 7, 20, 2, 0), equalTo("ee"));
    }

    @Test
    void subStrHash2() {
        assertThat(new Solution().subStrHash("fbxzaad", 31, 100, 3, 32), equalTo("fbx"));
    }
}
