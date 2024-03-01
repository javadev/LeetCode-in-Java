package g3001_3100.s3028_ant_on_the_boundary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void returnToBoundaryCount() {
        assertThat(new Solution().returnToBoundaryCount(new int[] {2, 3, -5}), equalTo(1));
    }

    @Test
    void returnToBoundaryCount2() {
        assertThat(new Solution().returnToBoundaryCount(new int[] {3, 2, -3, -4}), equalTo(0));
    }
}
