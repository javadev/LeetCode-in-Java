package g1601_1700.s1621_number_of_sets_of_k_non_overlapping_line_segments;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSets() {
        assertThat(new Solution().numberOfSets(4, 2), equalTo(5));
    }

    @Test
    void numberOfSets2() {
        assertThat(new Solution().numberOfSets(3, 1), equalTo(3));
    }

    @Test
    void numberOfSets3() {
        assertThat(new Solution().numberOfSets(30, 7), equalTo(796297179));
    }
}
