package g1201_1300.s1287_element_appearing_more_than_25_in_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSpecialInteger() {
        assertThat(
                new Solution().findSpecialInteger(new int[] {1, 2, 2, 6, 6, 6, 6, 7, 10}),
                equalTo(6));
    }

    @Test
    void findSpecialInteger2() {
        assertThat(new Solution().findSpecialInteger(new int[] {1, 1}), equalTo(1));
    }
}
