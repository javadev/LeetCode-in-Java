package g0101_0200.s0119_pascals_triangle_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getRow() {
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);
        assertThat(new Solution().getRow(3), equalTo(expected));
    }

    @Test
    void getRow2() {
        List<Integer> expected = Collections.singletonList(1);
        assertThat(new Solution().getRow(0), equalTo(expected));
    }

    @Test
    void getRow3() {
        List<Integer> expected = Arrays.asList(1, 1);
        assertThat(new Solution().getRow(1), equalTo(expected));
    }
}
