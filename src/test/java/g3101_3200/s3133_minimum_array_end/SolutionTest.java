package g3101_3200.s3133_minimum_array_end;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minEnd() {
        assertThat(new Solution().minEnd(3, 4), equalTo(6L));
    }

    @Test
    void minEnd2() {
        assertThat(new Solution().minEnd(2, 7), equalTo(15L));
    }
}
