package g3801_3900.s3826_minimum_partition_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPartitionScore() {
        assertThat(new Solution().minPartitionScore(new int[] {5, 1, 2, 1}, 2), equalTo(25L));
    }

    @Test
    void minPartitionScore2() {
        assertThat(new Solution().minPartitionScore(new int[] {1, 2, 3, 4}, 1), equalTo(55L));
    }

    @Test
    void minPartitionScore3() {
        assertThat(new Solution().minPartitionScore(new int[] {1, 1, 1}, 3), equalTo(3L));
    }
}
