package g3701_3800.s3798_largest_even_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestEven() {
        assertThat(new Solution().largestEven("1112"), equalTo("1112"));
    }

    @Test
    void largestEven2() {
        assertThat(new Solution().largestEven("221"), equalTo("22"));
    }

    @Test
    void largestEven3() {
        assertThat(new Solution().largestEven("1"), equalTo(""));
    }
}
