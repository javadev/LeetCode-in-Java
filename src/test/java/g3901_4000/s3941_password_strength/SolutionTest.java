package g3901_4000.s3941_password_strength;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void passwordStrength() {
        assertThat(new Solution().passwordStrength("aA1!"), equalTo(11));
    }

    @Test
    void passwordStrength2() {
        assertThat(new Solution().passwordStrength("bbB11#"), equalTo(11));
    }

    @Test
    void passwordStrength3() {
        assertThat(new Solution().passwordStrength("aaaa"), equalTo(1));
    }

    @Test
    void passwordStrength4() {
        assertThat(new Solution().passwordStrength("ZZZ"), equalTo(2));
    }

    @Test
    void passwordStrength5() {
        assertThat(new Solution().passwordStrength("000"), equalTo(3));
    }

    @Test
    void passwordStrength6() {
        assertThat(new Solution().passwordStrength("!@#$!"), equalTo(20));
    }

    @Test
    void passwordStrength7() {
        assertThat(
                new Solution()
                        .passwordStrength(
                                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$"),
                equalTo(128));
    }
}
