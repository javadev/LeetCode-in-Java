package g3901_4000.s3995_minimum_cost_to_convert_string_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution()
                        .minCost(
                                "hello",
                                "world",
                                List.of(List.of("he", "wo"), List.of("llo", "rld")),
                                new int[] {3, 4}),
                equalTo(7));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution()
                        .minCost("cat", "dog", List.of(List.of("c*t", "dog")), new int[] {2}),
                equalTo(3));
    }

    @Test
    void minCost3() {
        assertThat(
                new Solution()
                        .minCost("test", "next", List.of(List.of("*e*t", "next")), new int[] {4}),
                equalTo(6));
    }

    @Test
    void minCost4() {
        assertThat(
                new Solution().minCost("ab", "bc", List.of(List.of("a*", "bd")), new int[] {9}),
                equalTo(-1));
    }
}
