package g1701_1800.s1705_maximum_number_of_eaten_apples;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void eatenApples() {
        assertThat(
                new Solution().eatenApples(new int[] {1, 2, 3, 5, 2}, new int[] {3, 2, 1, 4, 2}),
                equalTo(7));
    }

    @Test
    void eatenApples2() {
        assertThat(
                new Solution()
                        .eatenApples(new int[] {3, 0, 0, 0, 0, 2}, new int[] {3, 0, 0, 0, 0, 2}),
                equalTo(5));
    }
}
