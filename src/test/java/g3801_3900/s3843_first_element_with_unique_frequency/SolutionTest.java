package g3801_3900.s3843_first_element_with_unique_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstUniqueFreq() {
        assertThat(new Solution().firstUniqueFreq(new int[] {20, 10, 30, 30}), equalTo(30));
    }

    @Test
    void firstUniqueFreq2() {
        assertThat(new Solution().firstUniqueFreq(new int[] {20, 20, 10, 30, 30, 30}), equalTo(20));
    }

    @Test
    void firstUniqueFreq3() {
        assertThat(new Solution().firstUniqueFreq(new int[] {10, 10, 20, 20}), equalTo(-1));
    }
}
