package g1201_1300.s1253_reconstruct_a_2_row_binary_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reconstructMatrix() {
        assertThat(
                new Solution().reconstructMatrix(2, 1, new int[] {1, 1, 1}),
                equalTo(Arrays.asList(Arrays.asList(0, 1, 1), Arrays.asList(1, 0, 0))));
    }

    @Test
    void reconstructMatrix2() {
        assertThat(
                new Solution().reconstructMatrix(2, 3, new int[] {2, 2, 1, 1}),
                equalTo(Collections.emptyList()));
    }

    @Test
    void reconstructMatrix3() {
        assertThat(
                new Solution().reconstructMatrix(5, 5, new int[] {2, 1, 2, 0, 1, 0, 1, 2, 0, 1}),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(1, 0, 1, 0, 0, 0, 1, 1, 0, 1),
                                Arrays.asList(1, 1, 1, 0, 1, 0, 0, 1, 0, 0))));
    }
}
