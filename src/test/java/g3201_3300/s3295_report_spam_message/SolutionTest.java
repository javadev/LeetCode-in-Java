package g3201_3300.s3295_report_spam_message;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reportSpam() {
        assertThat(
                new Solution()
                        .reportSpam(
                                new String[] {"hello", "world", "leetcode"},
                                new String[] {"world", "hello"}),
                equalTo(true));
    }

    @Test
    void reportSpam2() {
        assertThat(
                new Solution()
                        .reportSpam(
                                new String[] {"hello", "programming", "fun"},
                                new String[] {"world", "programming", "leetcode"}),
                equalTo(false));
    }
}
