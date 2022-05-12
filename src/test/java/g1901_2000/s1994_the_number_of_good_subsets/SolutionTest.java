package g1901_2000.s1994_the_number_of_good_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfGoodSubsets() {
        assertThat(new Solution().numberOfGoodSubsets(new int[] {1, 2, 3, 4}), equalTo(6));
    }

    @Test
    void numberOfGoodSubsets2() {
        assertThat(new Solution().numberOfGoodSubsets(new int[] {4, 2, 3, 15}), equalTo(5));
    }
}
