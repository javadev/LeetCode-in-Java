package g2701_2800.s2766_relocate_marbles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void relocateMarbles() {
        List<Integer> expected = Arrays.asList(5, 6, 8, 9);
        List<Integer> result =
                new Solution()
                        .relocateMarbles(
                                new int[] {1, 6, 7, 8}, new int[] {1, 7, 2}, new int[] {2, 9, 5});
        assertThat(result, equalTo(expected));
    }

    @Test
    void relocateMarbles2() {
        List<Integer> expected = Arrays.asList(2);
        List<Integer> result =
                new Solution()
                        .relocateMarbles(
                                new int[] {1, 1, 3, 3}, new int[] {1, 3}, new int[] {2, 2});
        assertThat(result, equalTo(expected));
    }
}
