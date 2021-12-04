package g0101_0200.s0119_pascals_triangle_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pascalTriangleII() {
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);
        assertThat(new Solution().getRow(3), equalTo(expected));
    }
}
