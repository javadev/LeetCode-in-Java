package g3801_3900.s3828_final_element_after_subarray_deletions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void finalElement() {
        assertThat(new Solution().finalElement(new int[] {1, 5, 2}), equalTo(2));
    }

    @Test
    void finalElement2() {
        assertThat(new Solution().finalElement(new int[] {3, 7}), equalTo(7));
    }
}
