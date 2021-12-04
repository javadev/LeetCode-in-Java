package g0201_0300.s0274_h_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void hindex() {
        assertThat(new Solution().hindex(new int[] {3, 0, 6, 1, 5}), equalTo(3));
    }

    @Test
    public void hindex2() {
        assertThat(new Solution().hindex(new int[] {1, 3, 1}), equalTo(1));
    }
}
