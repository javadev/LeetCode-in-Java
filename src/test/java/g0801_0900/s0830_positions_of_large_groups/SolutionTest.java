package g0801_0900.s0830_positions_of_large_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largeGroupPositions() {
        assertThat(
                new Solution().largeGroupPositions("abbxxxxzzy"),
                equalTo(Collections.singletonList(Arrays.asList(3, 6))));
    }

    @Test
    void largeGroupPositions2() {
        assertThat(new Solution().largeGroupPositions("abc"), equalTo(Collections.emptyList()));
    }

    @Test
    void largeGroupPositions3() {
        assertThat(
                new Solution().largeGroupPositions("abcdddeeeeaabbbcd"),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(3, 5), Arrays.asList(6, 9), Arrays.asList(12, 14))));
    }
}
