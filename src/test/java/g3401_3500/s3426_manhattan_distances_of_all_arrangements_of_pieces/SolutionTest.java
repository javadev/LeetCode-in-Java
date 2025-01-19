package g3401_3500.s3426_manhattan_distances_of_all_arrangements_of_pieces;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distanceSum() {
        assertThat(new Solution().distanceSum(2, 2, 2), equalTo(8));
    }

    @Test
    void distanceSum2() {
        assertThat(new Solution().distanceSum(1, 4, 3), equalTo(20));
    }
}
