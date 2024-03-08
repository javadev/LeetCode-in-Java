package g2901_3000.s2977_minimum_cost_to_convert_string_ii;

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
                                new String[] {"a", "b", "c", "c", "e", "d"},
                                new String[] {"b", "c", "b", "e", "b", "e"},
                                new int[] {2, 5, 5, 1, 2, 20}),
                equalTo(28L));
    }

    @Test
    void minimumCost2() {
        assertThat(
                new Solution()
                        .minimumCost(
                                "abcdefgh",
                                "acdeeghh",
                                new String[] {"bcd", "fgh", "thh"},
                                new String[] {"cde", "thh", "ghh"},
                                new int[] {1, 3, 5}),
                equalTo(9L));
    }

    @Test
    void minimumCost3() {
        assertThat(
                new Solution()
                        .minimumCost(
                                "abcdefgh",
                                "addddddd",
                                new String[] {"bcd", "defgh"},
                                new String[] {"ddd", "ddddd"},
                                new int[] {100, 1578}),
                equalTo(-1L));
    }
}
