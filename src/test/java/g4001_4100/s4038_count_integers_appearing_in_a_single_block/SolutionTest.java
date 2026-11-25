package g4001_4100.s4038_count_integers_appearing_in_a_single_block;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSpecialIntegers() {
        assertThat(new Solution().countSpecialIntegers(new int[] {1, 1, 2, 3, 2, 4}), equalTo(3));
    }

    @Test
    void countSpecialIntegers2() {
        assertThat(new Solution().countSpecialIntegers(new int[] {7, 7, 7}), equalTo(1));
    }

    @Test
    void countSpecialIntegers3() {
        assertThat(new Solution().countSpecialIntegers(new int[] {}), equalTo(0));
    }
}

