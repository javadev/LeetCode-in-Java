package g3801_3900.s3863_minimum_operations_to_sort_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("dog"), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("card"), equalTo(2));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations("gf"), equalTo(-1));
    }

    @Test
    void minOperations4() {
        assertThat(new Solution().minOperations("abc"), equalTo(0));
    }

    @Test
    void minOperations5() {
        assertThat(new Solution().minOperations("a"), equalTo(0));
    }

    @Test
    void minOperations6() {
        assertThat(new Solution().minOperations("z"), equalTo(0));
    }

    @Test
    void minOperations7() {
        assertThat(new Solution().minOperations("ab"), equalTo(0));
    }

    @Test
    void minOperations8() {
        assertThat(new Solution().minOperations("aa"), equalTo(0));
    }

    @Test
    void minOperations9() {
        assertThat(new Solution().minOperations("ba"), equalTo(-1));
    }

    @Test
    void minOperations10() {
        assertThat(new Solution().minOperations("aaa"), equalTo(0));
    }

    @Test
    void minOperations11() {
        assertThat(new Solution().minOperations("abcde"), equalTo(0));
    }

    @Test
    void minOperations12() {
        assertThat(new Solution().minOperations("bca"), equalTo(2));
    }

    @Test
    void minOperations13() {
        assertThat(new Solution().minOperations("bac"), equalTo(1));
    }

    @Test
    void minOperations14() {
        assertThat(new Solution().minOperations("cba"), equalTo(3));
    }

    @Test
    void minOperations15() {
        assertThat(new Solution().minOperations("cbba"), equalTo(3));
    }

    @Test
    void minOperations16() {
        assertThat(new Solution().minOperations("cbca"), equalTo(2));
    }
}
