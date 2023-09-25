package g2201_2300.s2299_strong_password_checker_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void strongPasswordCheckerII() {
        assertThat(new Solution().strongPasswordCheckerII("IloveLe3tcode!"), equalTo(true));
    }

    @Test
    void strongPasswordCheckerII2() {
        assertThat(new Solution().strongPasswordCheckerII("Me+You--IsMyDream"), equalTo(false));
    }

    @Test
    void strongPasswordCheckerII3() {
        assertThat(new Solution().strongPasswordCheckerII("1aB!"), equalTo(false));
    }

    @Test
    void strongPasswordCheckerII4() {
        assertThat(
                new Solution()
                        .strongPasswordCheckerII(
                                "ecuwcfoyajkolntovfniplayrxhzpmhrkhzonopcwxgupzhoupw"),
                equalTo(false));
    }

    @Test
    void strongPasswordCheckerII5() {
        assertThat(new Solution().strongPasswordCheckerII("\"|{}\"|{}"), equalTo(false));
    }
}
