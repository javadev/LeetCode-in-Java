package g2801_2900.s2818_apply_operations_to_maximize_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(new Solution().maximumScore(Arrays.asList(8, 3, 9, 3, 8), 2), equalTo(81));
    }

    @Test
    void maximumScore2() {
        assertThat(
                new Solution().maximumScore(Arrays.asList(19, 12, 14, 6, 10, 18), 3),
                equalTo(4788));
    }
}
