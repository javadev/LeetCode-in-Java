package g3101_3200.s3136_valid_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isValid() {
        assertThat(new Solution().isValid("234Adas"), equalTo(true));
    }

    @Test
    void isValid2() {
        assertThat(new Solution().isValid("b3"), equalTo(false));
    }

    @Test
    void isValid3() {
        assertThat(new Solution().isValid("a3$e"), equalTo(false));
    }

    @Test
    void isValid4() {
        assertThat(new Solution().isValid("a"), equalTo(false));
        assertThat(new Solution().isValid("ab"), equalTo(false));
        assertThat(new Solution().isValid("1"), equalTo(false));
        assertThat(new Solution().isValid("1a"), equalTo(false));
        assertThat(new Solution().isValid(""), equalTo(false));
    }

    @Test
    void isValid5() {
        assertThat(new Solution().isValid("aei"), equalTo(false));
        assertThat(new Solution().isValid("AEI"), equalTo(false));
        assertThat(new Solution().isValid("Aei"), equalTo(false));
        assertThat(new Solution().isValid("uuu"), equalTo(false));
    }

    @Test
    void isValid6() {
        assertThat(new Solution().isValid("bcdfg"), equalTo(false));
        assertThat(new Solution().isValid("BCD"), equalTo(false));
        assertThat(new Solution().isValid("xyz"), equalTo(false));
        assertThat(new Solution().isValid("QWRTY"), equalTo(false));
    }

    @Test
    void isValid7() {
        assertThat(new Solution().isValid("abc"), equalTo(true));
        assertThat(new Solution().isValid("bac"), equalTo(true));
        assertThat(new Solution().isValid("AeIbcD"), equalTo(true));
        assertThat(new Solution().isValid("tree"), equalTo(true));
        assertThat(new Solution().isValid("skyE"), equalTo(true));
    }

    @Test
    void isValid8() {
        assertThat(new Solution().isValid("a1b2c"), equalTo(true));
        assertThat(new Solution().isValid("1a2b"), equalTo(true));
        assertThat(new Solution().isValid("b2c4e"), equalTo(true));
        assertThat(new Solution().isValid("123"), equalTo(false));
    }

    @Test
    void isValid10() {
        assertThat(new Solution().isValid("a#b"), equalTo(false));
        assertThat(new Solution().isValid("@ab"), equalTo(false));
        assertThat(new Solution().isValid("ab!"), equalTo(false));
        assertThat(new Solution().isValid("c_d"), equalTo(false));
        assertThat(new Solution().isValid("a.b"), equalTo(false));
        assertThat(new Solution().isValid("abc "), equalTo(false));
    }

    @Test
    void isValid11() {
        assertThat(new Solution().isValid("AbC"), equalTo(true));
        assertThat(new Solution().isValid("BacE1"), equalTo(true));
        assertThat(new Solution().isValid("zEi"), equalTo(true));
    }

    @Test
    void isValid12() {
        assertThat(new Solution().isValid("a1b"), equalTo(true));
        assertThat(new Solution().isValid("ab1"), equalTo(true));
        assertThat(new Solution().isValid("1ab"), equalTo(true));
        assertThat(new Solution().isValid("1a"), equalTo(false));
        assertThat(new Solution().isValid("1b"), equalTo(false));
    }
}
