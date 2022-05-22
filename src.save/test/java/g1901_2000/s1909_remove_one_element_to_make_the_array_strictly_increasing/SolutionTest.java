package g1901_2000.s1909_remove_one_element_to_make_the_array_strictly_increasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canBeIncreasing() {
        assertThat(new Solution().canBeIncreasing(new int[] {1, 2, 10, 5, 7}), equalTo(true));
    }

    @Test
    void canBeIncreasing2() {
        assertThat(new Solution().canBeIncreasing(new int[] {2, 3, 1, 2}), equalTo(false));
    }

    @Test
    void canBeIncreasing3() {
        assertThat(new Solution().canBeIncreasing(new int[] {1, 1, 1}), equalTo(false));
    }
}
