package g3801_3900.s3842_toggle_light_bulbs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void toggleLightBulbs() {
        assertThat(
                new Solution().toggleLightBulbs(Arrays.asList(10, 30, 20, 10)),
                equalTo(Arrays.asList(20, 30)));
    }

    @Test
    void toggleLightBulbs2() {
        assertThat(
                new Solution().toggleLightBulbs(Arrays.asList(100, 100)), equalTo(Arrays.asList()));
    }
}
