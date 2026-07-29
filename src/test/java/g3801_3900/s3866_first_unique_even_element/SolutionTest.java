package g3801_3900.s3866_first_unique_even_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstUniqueEven() {
        assertThat(new Solution().firstUniqueEven(new int[] {3, 4, 2, 5, 4, 6}), equalTo(2));
    }

    @Test
    void firstUniqueEven2() {
        assertThat(new Solution().firstUniqueEven(new int[] {4, 4}), equalTo(-1));
    }

    @Test
    void firstUniqueEven3() {
        assertThat(new Solution().firstUniqueEven(new int[] {2, 3, 2, 4}), equalTo(4));
    }
}
