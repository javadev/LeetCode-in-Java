package g2401_2500.s2404_most_frequent_even_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostFrequentEven() {
        assertThat(new Solution().mostFrequentEven(new int[] {0, 1, 2, 2, 4, 4, 1}), equalTo(2));
    }

    @Test
    void mostFrequentEven2() {
        assertThat(new Solution().mostFrequentEven(new int[] {4, 4, 4, 9, 2, 4}), equalTo(4));
    }

    @Test
    void mostFrequentEven3() {
        assertThat(
                new Solution().mostFrequentEven(new int[] {29, 47, 21, 41, 13, 37, 25, 7}),
                equalTo(-1));
    }
}
