package g2501_2600.s2572_count_the_number_of_square_free_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void squareFreeSubsets() {
        assertThat(new Solution().squareFreeSubsets(new int[] {3, 4, 4, 5}), equalTo(3));
    }

    @Test
    void squareFreeSubsets2() {
        assertThat(new Solution().squareFreeSubsets(new int[] {1}), equalTo(1));
    }
}
