package g3701_3800.s3725_count_ways_to_choose_coprime_integers_from_rows;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCoprime() {
        assertThat(new Solution().countCoprime(new int[][] {{1, 2}, {3, 4}}), equalTo(3));
    }

    @Test
    void countCoprime2() {
        assertThat(new Solution().countCoprime(new int[][] {{2, 2}, {2, 2}}), equalTo(0));
    }
}
