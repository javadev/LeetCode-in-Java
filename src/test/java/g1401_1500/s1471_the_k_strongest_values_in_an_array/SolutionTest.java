package g1401_1500.s1471_the_k_strongest_values_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getStrongest() {
        assertThat(
                new Solution().getStrongest(new int[] {1, 2, 3, 4, 5}, 2),
                equalTo(new int[] {5, 1}));
    }

    @Test
    void getStrongest2() {
        assertThat(
                new Solution().getStrongest(new int[] {1, 1, 3, 5, 5}, 2),
                equalTo(new int[] {5, 5}));
    }

    @Test
    void getStrongest3() {
        assertThat(
                new Solution().getStrongest(new int[] {6, 7, 11, 7, 6, 8}, 5),
                equalTo(new int[] {11, 8, 6, 6, 7}));
    }
}
