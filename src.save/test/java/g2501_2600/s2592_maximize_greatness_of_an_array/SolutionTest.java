package g2501_2600.s2592_maximize_greatness_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeGreatness() {
        assertThat(new Solution().maximizeGreatness(new int[] {1, 3, 5, 2, 1, 3, 1}), equalTo(4));
    }

    @Test
    void maximizeGreatness2() {
        assertThat(new Solution().maximizeGreatness(new int[] {1, 2, 3, 4}), equalTo(3));
    }
}
