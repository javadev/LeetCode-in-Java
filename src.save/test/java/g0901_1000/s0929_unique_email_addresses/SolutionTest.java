package g0901_1000.s0929_unique_email_addresses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numUniqueEmails() {
        assertThat(
                new Solution()
                        .numUniqueEmails(
                                new String[] {
                                    "test.email+alex@leetcode.com",
                                    "test.e.mail+bob.cathy@leetcode.com",
                                    "testemail+david@lee.tcode.com"
                                }),
                equalTo(2));
    }

    @Test
    void numUniqueEmails2() {
        assertThat(
                new Solution()
                        .numUniqueEmails(
                                new String[] {
                                    "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"
                                }),
                equalTo(3));
    }
}
