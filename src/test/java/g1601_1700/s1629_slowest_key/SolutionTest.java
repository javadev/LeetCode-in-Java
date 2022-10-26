package g1601_1700.s1629_slowest_key;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void slowestKey() {
        assertThat(new Solution().slowestKey(new int[] {9, 29, 49, 50}, "cbcd"), equalTo('c'));
    }

    @Test
    void slowestKey2() {
        assertThat(
                new Solution().slowestKey(new int[] {12, 23, 36, 46, 62}, "spuda"), equalTo('a'));
    }
}
