package g0501_0600.s0591_tag_validator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isValid() {
        assertThat(
                new Solution().isValid("<DIV>This is the first line <![CDATA[<div>]]></DIV>"),
                equalTo(true));
    }

    @Test
    void isValid2() {
        assertThat(
                new Solution()
                        .isValid(
                                "<ABCDEFGHIJKLMN>This is the first line <![CDATA[<div>]]></ABCDEFGHIJKLMN>"),
                equalTo(false));
    }
}
