package g3701_3800.s3743_maximize_cyclic_partition_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(new Solution().maximumScore(new int[] {5, 5, 5}, 2), equalTo(0L));
    }

    @Test
    void maximumScore2() {
        assertThat(new Solution().maximumScore(new int[] {1, 3, 2}, 1), equalTo(2L));
    }

    @Test
    void maximumScore3() {
        assertThat(new Solution().maximumScore(new int[] {1, 4, 2}, 2), equalTo(3L));
    }
}
