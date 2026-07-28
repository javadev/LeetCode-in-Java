package g3801_3900.s3861_minimum_capacity_box;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnsSmallestSuitableCapacityAndItsFirstIndex() {
        Solution solution = new Solution();

        assertThat(solution.minimumIndex(new int[] {1, 5, 3, 7}, 3), equalTo(2));
        assertThat(solution.minimumIndex(new int[] {3, 5, 4, 3}, 2), equalTo(0));
        assertThat(solution.minimumIndex(new int[] {4}, 5), equalTo(-1));
    }
}
