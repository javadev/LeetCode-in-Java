package g1401_1500.s1416_restore_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfArrays() {
        assertThat(new Solution().numberOfArrays("1000", 10000), equalTo(1));
    }

    @Test
    void numberOfArrays2() {
        assertThat(new Solution().numberOfArrays("1000", 10), equalTo(0));
    }

    @Test
    void numberOfArrays3() {
        assertThat(new Solution().numberOfArrays("1317", 2000), equalTo(8));
    }
}
