package g0201_0300.s0229_majority_element_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void majorityElement() {
        assertThat(new Solution().majorityElement(new int[] {3, 2, 3}), equalTo(Arrays.asList(3)));
    }

    @Test
    void majorityElement2() {
        assertThat(
                new Solution().majorityElement(new int[] {1}),
                equalTo(Collections.singletonList(1)));
    }

    @Test
    void majorityElement3() {
        assertThat(new Solution().majorityElement(new int[] {1, 2}), equalTo(Arrays.asList(2, 1)));
    }
}
