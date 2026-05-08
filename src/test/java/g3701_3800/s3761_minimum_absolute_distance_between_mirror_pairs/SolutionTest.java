package g3701_3800.s3761_minimum_absolute_distance_between_mirror_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMirrorPairDistance() {
        assertThat(new Solution().minMirrorPairDistance(new int[] {12, 21}), equalTo(1));
    }

    @Test
    void minMirrorPairDistance2() {
        assertThat(new Solution().minMirrorPairDistance(new int[] {10, 1, 100}), equalTo(1));
    }

    @Test
    void minMirrorPairDistance3() {
        assertThat(new Solution().minMirrorPairDistance(new int[] {12, 34, 56}), equalTo(-1));
    }
}
