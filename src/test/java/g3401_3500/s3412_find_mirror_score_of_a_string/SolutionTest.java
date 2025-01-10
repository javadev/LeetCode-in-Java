package g3401_3500.s3412_find_mirror_score_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void calculateScore() {
        assertThat(new Solution().calculateScore("aczzx"), equalTo(5L));
    }

    @Test
    void calculateScore2() {
        assertThat(new Solution().calculateScore("abcdef"), equalTo(0L));
    }
}
