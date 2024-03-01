package g1401_1500.s1446_consecutive_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPower() {
        assertThat(new Solution().maxPower("leetcode"), equalTo(2));
    }

    @Test
    void maxPower2() {
        assertThat(new Solution().maxPower("abbcccddddeeeeedcba"), equalTo(5));
    }
}
