package g2501_2600.s2576_find_the_maximum_number_of_marked_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNumOfMarkedIndices() {
        assertThat(new Solution().maxNumOfMarkedIndices(new int[] {3, 5, 2, 4}), equalTo(2));
    }

    @Test
    void maxNumOfMarkedIndices2() {
        assertThat(new Solution().maxNumOfMarkedIndices(new int[] {9, 2, 5, 4}), equalTo(4));
    }

    @Test
    void maxNumOfMarkedIndices3() {
        assertThat(new Solution().maxNumOfMarkedIndices(new int[] {7, 6, 8}), equalTo(0));
    }
}
