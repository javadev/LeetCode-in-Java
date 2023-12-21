package g1201_1300.s1299_replace_elements_with_greatest_element_on_right_side;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void replaceElements() {
        assertThat(
                new Solution().replaceElements(new int[] {17, 18, 5, 4, 6, 1}),
                equalTo(new int[] {18, 6, 6, 6, 1, -1}));
    }

    @Test
    void replaceElements2() {
        assertThat(new Solution().replaceElements(new int[] {400}), equalTo(new int[] {-1}));
    }
}
