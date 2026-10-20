package g3901_4000.s3968_maximum_manhattan_distance_after_all_moves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistance() {
        assertThat(new Solution().maxDistance("L_D_"), equalTo(4));
    }

    @Test
    void maxDistance2() {
        assertThat(new Solution().maxDistance("U_R"), equalTo(3));
    }
}
