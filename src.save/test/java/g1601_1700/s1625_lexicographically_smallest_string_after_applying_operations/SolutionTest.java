package g1601_1700.s1625_lexicographically_smallest_string_after_applying_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLexSmallestString() {
        assertThat(new Solution().findLexSmallestString("5525", 9, 2), equalTo("2050"));
    }

    @Test
    void findLexSmallestString2() {
        assertThat(new Solution().findLexSmallestString("74", 5, 1), equalTo("24"));
    }

    @Test
    void findLexSmallestString3() {
        assertThat(new Solution().findLexSmallestString("0011", 4, 2), equalTo("0011"));
    }
}
