package g1201_1300.s1202_smallest_string_with_swaps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestStringWithSwaps() {
        assertThat(
                new Solution()
                        .smallestStringWithSwaps(
                                "dcab", Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2))),
                equalTo("bacd"));
    }

    @Test
    void smallestStringWithSwaps2() {
        assertThat(
                new Solution()
                        .smallestStringWithSwaps(
                                "dcab",
                                Arrays.asList(
                                        Arrays.asList(0, 3),
                                        Arrays.asList(1, 2),
                                        Arrays.asList(0, 2))),
                equalTo("abcd"));
    }

    @Test
    void smallestStringWithSwaps3() {
        assertThat(
                new Solution()
                        .smallestStringWithSwaps(
                                "cba", Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2))),
                equalTo("abc"));
    }
}
