package g2401_2500.s2449_minimum_number_of_operations_to_make_arrays_similar;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeSimilar() {
        assertThat(
                new Solution().makeSimilar(new int[] {8, 12, 6}, new int[] {2, 14, 10}),
                equalTo(2L));
    }

    @Test
    void makeSimilar2() {
        assertThat(
                new Solution().makeSimilar(new int[] {1, 2, 5}, new int[] {4, 1, 3}), equalTo(1L));
    }

    @Test
    void makeSimilar3() {
        assertThat(
                new Solution().makeSimilar(new int[] {1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1}),
                equalTo(0L));
    }
}
