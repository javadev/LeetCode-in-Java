package g2101_2200.s2105_watering_plants_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumRefill() {
        assertThat(new Solution().minimumRefill(new int[] {2, 2, 3, 3}, 5, 5), equalTo(1));
    }

    @Test
    void minimumRefill2() {
        assertThat(new Solution().minimumRefill(new int[] {2, 2, 3, 3}, 3, 4), equalTo(2));
    }

    @Test
    void minimumRefill3() {
        assertThat(new Solution().minimumRefill(new int[] {5}, 10, 8), equalTo(0));
    }

    @Test
    void minimumRefill4() {
        assertThat(new Solution().minimumRefill(new int[] {1, 2, 4, 4, 5}, 6, 5), equalTo(2));
    }
}
