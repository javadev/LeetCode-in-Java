package g3901_4000.s3964_minimum_lights_to_illuminate_a_road;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minLights() {
        assertThat(new Solution().minLights(new int[] {0, 0, 0, 0}), equalTo(2));
    }

    @Test
    void minLights2() {
        assertThat(new Solution().minLights(new int[] {0, 0, 0, 2, 0}), equalTo(1));
    }
}
