package g2101_2200.s2154_keep_multiplying_found_values_by_two;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findFinalValue() {
        assertThat(new Solution().findFinalValue(new int[] {5, 3, 6, 1, 12}, 3), equalTo(24));
    }

    @Test
    void findFinalValue2() {
        assertThat(new Solution().findFinalValue(new int[] {2, 7, 9}, 4), equalTo(4));
    }
}
