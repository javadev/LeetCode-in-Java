package g0001_0100.s0072_edit_distance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void minDistance() {
        assertThat(new Solution().minDistance("horse", "ros"), equalTo(3));
    }
}
