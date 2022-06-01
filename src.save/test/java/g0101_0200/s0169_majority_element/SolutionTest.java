package g0101_0200.s0169_majority_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void majorityElement() {
        assertThat(new Solution().majorityElement(new int[] {3, 2, 3}), equalTo(3));
    }

    @Test
    void majorityElement2() {
        assertThat(new Solution().majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}), equalTo(2));
    }
}
