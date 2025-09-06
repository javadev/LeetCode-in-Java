package g3601_3700.s3666_minimum_operations_to_equalize_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("110", 1), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("0101", 3), equalTo(2));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations("101", 2), equalTo(-1));
    }

    @Test
    void minOperations4() {
        int k = 3;
        assertThat(new Solution().minOperations("111111", k), equalTo(0));
    }

    @Test
    void minOperations5() {
        int k = 6;
        assertThat(new Solution().minOperations("000000", k), equalTo(1));
    }

    @Test
    void minOperations6() {
        int k = 6;
        assertThat(new Solution().minOperations("000111", k), equalTo(-1));
    }

    @Test
    void minOperations7() {
        int k = 3;
        assertThat(new Solution().minOperations("0011", k), equalTo(2));
    }

    @Test
    void minOperations8() {
        int k = 4;
        assertThat(new Solution().minOperations("000011", k), equalTo(1));
    }

    @Test
    void minOperations9() {
        int k = 2;
        assertThat(new Solution().minOperations("000111", k), equalTo(-1));
    }

    @Test
    void minOperations10() {
        int k = 4;
        assertThat(new Solution().minOperations("001100", k), equalTo(1));
    }

    @Test
    void minOperations11() {
        int k = 3;
        assertThat(new Solution().minOperations("000100", k), equalTo(3));
    }

    @Test
    void minOperations12() {
        int k = 4;
        assertThat(new Solution().minOperations("111111", k), equalTo(0));
    }

    @Test
    void minOperations13() {
        int k = 4;
        assertThat(new Solution().minOperations("001001", k), equalTo(1));
    }
}
