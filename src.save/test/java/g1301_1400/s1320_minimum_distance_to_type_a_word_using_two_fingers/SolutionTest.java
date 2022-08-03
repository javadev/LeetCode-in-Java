package g1301_1400.s1320_minimum_distance_to_type_a_word_using_two_fingers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDistance() {
        assertThat(new Solution().minimumDistance("CAKE"), equalTo(3));
    }

    @Test
    void minimumDistance2() {
        assertThat(new Solution().minimumDistance("HAPPY"), equalTo(6));
    }
}
