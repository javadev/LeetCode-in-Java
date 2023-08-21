package g2501_2600.s2562_find_the_array_concatenation_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTheArrayConcVal() {
        assertThat(new Solution().findTheArrayConcVal(new int[] {7, 52, 2, 4}), equalTo(596L));
    }

    @Test
    void findTheArrayConcVal2() {
        assertThat(new Solution().findTheArrayConcVal(new int[] {5, 14, 13, 8, 12}), equalTo(673L));
    }
}
