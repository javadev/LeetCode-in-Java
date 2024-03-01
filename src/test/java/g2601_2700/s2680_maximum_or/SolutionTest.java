package g2601_2700.s2680_maximum_or;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumOr() {
        assertThat(new Solution().maximumOr(new int[] {12, 9}, 1), equalTo(30L));
    }

    @Test
    void maximumOr2() {
        assertThat(new Solution().maximumOr(new int[] {8, 1, 2}, 2), equalTo(35L));
    }
}
