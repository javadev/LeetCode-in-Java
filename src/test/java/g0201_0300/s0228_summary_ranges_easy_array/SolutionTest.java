package g0201_0300.s0228_summary_ranges;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void summaryRanges() {
        assertThat(
                new Solution().summaryRanges(new int[] {0, 1, 2, 4, 5, 7}),
                equalTo(Arrays.asList("0->2", "4->5", "7")));
    }
}
