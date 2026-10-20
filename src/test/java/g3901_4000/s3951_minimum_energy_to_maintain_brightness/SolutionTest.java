package g3901_4000.s3951_minimum_energy_to_maintain_brightness;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minEnergy() {
        assertThat(new Solution().minEnergy(5, 5, new int[][] {{6, 12}}), equalTo(14L));
    }

    @Test
    void minEnergy2() {
        assertThat(new Solution().minEnergy(2, 1, new int[][] {{0, 0}, {2, 2}}), equalTo(2L));
    }

    @Test
    void minEnergy3() {
        assertThat(new Solution().minEnergy(4, 2, new int[][] {{1, 3}, {2, 4}}), equalTo(4L));
    }

    @Test
    void minEnergy4() {
        assertThat(new Solution().minEnergy(3, 1, new int[][] {{5, 6}, {0, 1}}), equalTo(4L));
    }
}
