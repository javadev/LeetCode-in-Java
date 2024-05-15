package g3101_3200.s3147_taking_maximum_energy_from_the_mystic_dungeon;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumEnergy() {
        assertThat(new Solution().maximumEnergy(new int[] {5, 2, -10, -5, 1}, 3), equalTo(3));
    }

    @Test
    void maximumEnergy2() {
        assertThat(new Solution().maximumEnergy(new int[] {-2, -3, -1}, 2), equalTo(-1));
    }
}
