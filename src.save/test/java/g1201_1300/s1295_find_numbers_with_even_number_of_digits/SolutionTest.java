package g1201_1300.s1295_find_numbers_with_even_number_of_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findNumbers() {
        assertThat(new Solution().findNumbers(new int[] {12, 345, 2, 6, 7896}), equalTo(2));
    }

    @Test
    void findNumbers2() {
        assertThat(new Solution().findNumbers(new int[] {555, 901, 482, 1771}), equalTo(1));
    }
}
