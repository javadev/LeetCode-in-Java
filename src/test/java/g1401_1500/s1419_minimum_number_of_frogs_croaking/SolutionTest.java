package g1401_1500.s1419_minimum_number_of_frogs_croaking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minNumberOfFrogs() {
        assertThat(new Solution().minNumberOfFrogs("croakcroak"), equalTo(1));
    }

    @Test
    void minNumberOfFrogs2() {
        assertThat(new Solution().minNumberOfFrogs("crcoakroak"), equalTo(2));
    }

    @Test
    void minNumberOfFrogs3() {
        assertThat(new Solution().minNumberOfFrogs("croakcrook"), equalTo(-1));
    }
}
