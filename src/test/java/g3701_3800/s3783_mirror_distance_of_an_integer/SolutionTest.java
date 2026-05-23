package g3701_3800.s3783_mirror_distance_of_an_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mirrorDistance() {
        assertThat(new Solution().mirrorDistance(25), equalTo(27));
    }

    @Test
    void mirrorDistance2() {
        assertThat(new Solution().mirrorDistance(10), equalTo(9));
    }

    @Test
    void mirrorDistance3() {
        assertThat(new Solution().mirrorDistance(7), equalTo(0));
    }
}
