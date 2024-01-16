package g2601_2700.s2614_prime_in_diagonal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void diagonalPrime() {
        assertThat(
                new Solution()
                        .diagonalPrime(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,3],[5,6,7],[9,10,11]")),
                equalTo(11));
    }

    @Test
    void diagonalPrime2() {
        assertThat(
                new Solution()
                        .diagonalPrime(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,3],[5,17,7],[9,11,10]")),
                equalTo(17));
    }
}
