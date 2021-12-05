package g0201_0300.s0229_majority_element_ii_medium_array_hash_table_sorting_counting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void majorityElement() {
        assertThat(new Solution().majorityElement(new int[] {3, 2, 3}), equalTo(Arrays.asList(3)));
    }
}
