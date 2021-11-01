package s0029_divide_two_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void divide() {
        assertThat(new Solution().divide(10, 3), equalTo(3));
    }
}
