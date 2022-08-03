package g1701_1800.s1785_minimum_elements_to_add_to_form_a_given_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minElements() {
        assertThat(new Solution().minElements(new int[] {1, -1, 1}, 3, -4), equalTo(2));
    }

    @Test
    void minElements2() {
        assertThat(new Solution().minElements(new int[] {1, -10, 9, 1}, 100, 0), equalTo(1));
    }
}
