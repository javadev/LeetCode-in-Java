package g3201_3300.s3272_find_the_count_of_good_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodIntegers() {
        assertThat(new Solution().countGoodIntegers(3, 5), equalTo(27L));
    }

    @Test
    void countGoodIntegers2() {
        assertThat(new Solution().countGoodIntegers(1, 4), equalTo(2L));
    }

    @Test
    void countGoodIntegers3() {
        assertThat(new Solution().countGoodIntegers(5, 6), equalTo(2468L));
    }
}
