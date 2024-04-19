package g3001_3100.s3100_water_bottles_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxBottlesDrunk() {
        assertThat(new Solution().maxBottlesDrunk(13, 6), equalTo(15));
    }

    @Test
    void maxBottlesDrunk2() {
        assertThat(new Solution().maxBottlesDrunk(10, 3), equalTo(13));
    }
}
