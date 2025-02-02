package g3401_3500.s3443_maximum_manhattan_distance_after_k_changes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistance() {
        assertThat(new Solution().maxDistance("NWSE", 1), equalTo(3));
    }

    @Test
    void maxDistance2() {
        assertThat(new Solution().maxDistance("NSWWEW", 3), equalTo(6));
    }
}
