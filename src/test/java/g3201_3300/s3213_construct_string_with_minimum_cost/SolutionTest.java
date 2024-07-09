package g3201_3300.s3213_construct_string_with_minimum_cost;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(
                new Solution()
                        .minimumCost(
                                "abcdef",
                                new String[] {"abdef", "abc", "d", "def", "ef"},
                                new int[] {100, 1, 1, 10, 5}),
                equalTo(7));
    }

    @Test
    void minimumCost2() {
        assertThat(
                new Solution()
                        .minimumCost(
                                "aaaa", new String[] {"z", "zz", "zzz"}, new int[] {1, 10, 100}),
                equalTo(-1));
    }
}
