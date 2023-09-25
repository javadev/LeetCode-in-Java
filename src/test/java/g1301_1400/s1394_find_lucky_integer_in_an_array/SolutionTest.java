package g1301_1400.s1394_find_lucky_integer_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLucky() {
        assertThat(new Solution().findLucky(new int[] {2, 2, 3, 4}), equalTo(2));
    }

    @Test
    void findLucky2() {
        assertThat(new Solution().findLucky(new int[] {1, 2, 2, 3, 3, 3}), equalTo(3));
    }

    @Test
    void findLucky3() {
        assertThat(new Solution().findLucky(new int[] {2, 2, 2, 3, 3}), equalTo(-1));
    }
}
