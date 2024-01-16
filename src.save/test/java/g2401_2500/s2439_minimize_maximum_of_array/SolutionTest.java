package g2401_2500.s2439_minimize_maximum_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeArrayValue() {
        assertThat(new Solution().minimizeArrayValue(new int[] {3, 7, 1, 6}), equalTo(5));
    }

    @Test
    void minimizeArrayValue2() {
        assertThat(new Solution().minimizeArrayValue(new int[] {10, 1}), equalTo(10));
    }
}
