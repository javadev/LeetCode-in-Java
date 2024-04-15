package g2901_3000.s2976_minimum_cost_to_convert_string_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(
                new Solution()
                        .minimumCost(
                                "abcd",
                                "acbe",
                                new char[] {'a', 'b', 'c', 'c', 'e', 'd'},
                                new char[] {'b', 'c', 'b', 'e', 'b', 'e'},
                                new int[] {2, 5, 5, 1, 2, 20}),
                equalTo(28L));
    }

    @Test
    void minimumCost2() {
        assertThat(
                new Solution()
                        .minimumCost(
                                "aaaa",
                                "bbbb",
                                new char[] {'a', 'c'},
                                new char[] {'c', 'b'},
                                new int[] {1, 2}),
                equalTo(12L));
    }

    @Test
    void minimumCost3() {
        assertThat(
                new Solution()
                        .minimumCost(
                                "abcd",
                                "abce",
                                new char[] {'a'},
                                new char[] {'e'},
                                new int[] {1000}),
                equalTo(-1L));
    }
}
