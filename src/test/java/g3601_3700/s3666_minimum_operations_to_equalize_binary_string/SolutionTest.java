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
        String s = "111111";
        int k = 3;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(0));
    }

    @Test
    void minOperations5() {
        String s = "000000";
        int k = 6;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(1));
    }

    @Test
    void minOperations6() {
        String s = "000111";
        int k = 6;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(-1));
    }

    @Test
    void minOperations7() {
        String s = "0011";
        int k = 3;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(2));
    }

    @Test
    void minOperations8() {
        String s = "000011";
        int k = 4;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(1));
    }

    @Test
    void minOperations9() {
        String s = "000111";
        int k = 2;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(-1));
    }

    @Test
    void minOperations10() {
        String s = "001100";
        int k = 4;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(1));
    }

    @Test
    void minOperations11() {
        String s = "000100";
        int k = 3;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(3));
    }

    @Test
    void minOperations12() {
        String s = "111111";
        int k = 4;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(0));
    }

    @Test
    void minOperations13() {
        String s = "001001";
        int k = 4;
        int result = new Solution().minOperations(s, k);
        assertThat(result, equalTo(1));
    }
}
