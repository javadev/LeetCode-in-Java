package g2001_2100.s2079_watering_plants;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wateringPlants() {
        assertThat(new Solution().wateringPlants(new int[] {2, 2, 3, 3}, 5), equalTo(14));
    }

    @Test
    void wateringPlants2() {
        assertThat(new Solution().wateringPlants(new int[] {1, 1, 1, 4, 2, 3}, 4), equalTo(30));
    }

    @Test
    void wateringPlants3() {
        assertThat(new Solution().wateringPlants(new int[] {7, 7, 7, 7, 7, 7, 7}, 8), equalTo(49));
    }
}
