package g2501_2600.s2575_find_the_divisibility_array_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void divisibilityArray() {
        assertThat(
                new Solution().divisibilityArray("998244353", 3),
                equalTo(new int[] {1, 1, 0, 0, 0, 1, 1, 0, 0}));
    }

    @Test
    void divisibilityArray2() {
        assertThat(new Solution().divisibilityArray("1010", 10), equalTo(new int[] {0, 1, 0, 1}));
    }
}
