package g2101_2200.s2178_maximum_split_of_positive_even_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumEvenSplit() {
        assertThat(new Solution().maximumEvenSplit(12), equalTo(Arrays.asList(2L, 4L, 6L)));
    }

    @Test
    void maximumEvenSplit2() {
        assertThat(new Solution().maximumEvenSplit(7), equalTo(Collections.emptyList()));
    }

    @Test
    void maximumEvenSplit3() {
        assertThat(new Solution().maximumEvenSplit(28), equalTo(Arrays.asList(2L, 4L, 6L, 16L)));
    }
}
