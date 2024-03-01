package g1901_2000.s1974_minimum_time_to_type_word_using_special_typewriter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTimeToType() {
        assertThat(new Solution().minTimeToType("abc"), equalTo(5));
    }

    @Test
    void minTimeToType2() {
        assertThat(new Solution().minTimeToType("bza"), equalTo(7));
    }

    @Test
    void minTimeToType3() {
        assertThat(new Solution().minTimeToType("zjpc"), equalTo(34));
    }
}
