package g1901_2000.s1998_gcd_sort_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gcdSort() {
        assertThat(new Solution().gcdSort(new int[] {7, 21, 3}), equalTo(true));
    }

    @Test
    void gcdSort2() {
        assertThat(new Solution().gcdSort(new int[] {5, 2, 6, 2}), equalTo(false));
    }

    @Test
    void gcdSort3() {
        assertThat(new Solution().gcdSort(new int[] {10, 5, 9, 3, 15}), equalTo(true));
    }
}
