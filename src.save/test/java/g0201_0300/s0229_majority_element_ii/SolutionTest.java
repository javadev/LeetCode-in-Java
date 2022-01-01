package g0201_0300.s0229_majority_element_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void majorityElement() {
        assertThat(new Solution().majorityElement(new int[] {3, 2, 3}), equalTo(Arrays.asList(3)));
    }
}
