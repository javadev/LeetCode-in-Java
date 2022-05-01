package g1401_1500.s1424_diagonal_traverse_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDiagonalOrder() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));
        assertThat(
                new Solution().findDiagonalOrder(input),
                equalTo(new int[] {1, 4, 2, 7, 5, 3, 8, 6, 9}));
    }

    @Test
    void findDiagonalOrder2() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(1, 2, 3, 4, 5),
                        Arrays.asList(6, 7),
                        Arrays.asList(8),
                        Arrays.asList(9, 10, 11),
                        Arrays.asList(12, 13, 14, 15, 16));
        assertThat(
                new Solution().findDiagonalOrder(input),
                equalTo(new int[] {1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16}));
    }
}
