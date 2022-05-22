package g1901_2000.s1985_find_the_kth_largest_integer_in_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthLargestNumber() {
        assertThat(
                new Solution().kthLargestNumber(new String[] {"3", "6", "7", "10"}, 4),
                equalTo("3"));
    }

    @Test
    void kthLargestNumber2() {
        assertThat(
                new Solution().kthLargestNumber(new String[] {"2", "21", "12", "1"}, 3),
                equalTo("2"));
    }

    @Test
    void kthLargestNumber3() {
        assertThat(new Solution().kthLargestNumber(new String[] {"0", "0"}, 2), equalTo("0"));
    }
}
