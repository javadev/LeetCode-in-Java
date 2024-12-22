package g3301_3400.s3397_maximum_number_of_distinct_elements_after_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistinctElements() {
        assertThat(new Solution().maxDistinctElements(new int[] {1, 2, 2, 3, 3, 4}, 2), equalTo(6));
    }

    @Test
    void maxDistinctElements2() {
        assertThat(new Solution().maxDistinctElements(new int[] {4, 4, 4, 4}, 1), equalTo(3));
    }
}
