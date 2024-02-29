package g3001_3100.s3044_most_frequent_prime;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostFrequentPrime() {
        assertThat(
                new Solution().mostFrequentPrime(new int[][] {{1, 1}, {9, 9}, {1, 1}}),
                equalTo(19));
    }

    @Test
    void mostFrequentPrime2() {
        assertThat(new Solution().mostFrequentPrime(new int[][] {{7}}), equalTo(-1));
    }

    @Test
    void mostFrequentPrime3() {
        assertThat(
                new Solution().mostFrequentPrime(new int[][] {{9, 7, 8}, {4, 6, 5}, {2, 8, 6}}),
                equalTo(97));
    }
}
