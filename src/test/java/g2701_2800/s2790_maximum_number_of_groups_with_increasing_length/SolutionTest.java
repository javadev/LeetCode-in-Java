package g2701_2800.s2790_maximum_number_of_groups_with_increasing_length;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxIncreasingGroups() {
        assertThat(new Solution().maxIncreasingGroups(Arrays.asList(1, 2, 5)), equalTo(3));
    }

    @Test
    void maxIncreasingGroups2() {
        assertThat(new Solution().maxIncreasingGroups(Arrays.asList(2, 1, 2)), equalTo(2));
    }
}
