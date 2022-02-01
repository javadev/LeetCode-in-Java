package g0801_0900.s0811_subdomain_visit_count;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subdomainVisits() {
        assertThat(
                new Solution().subdomainVisits(new String[] {"9001 discuss.leetcode.com"}),
                equalTo(
                        Arrays.asList(
                                "9001 com", "9001 leetcode.com", "9001 discuss.leetcode.com")));
    }

    @Test
    void subdomainVisits2() {
        assertThat(
                new Solution()
                        .subdomainVisits(
                                new String[] {
                                    "900 google.mail.com",
                                    "50 yahoo.com",
                                    "1 intel.mail.com",
                                    "5 wiki.org"
                                }),
                equalTo(
                        Arrays.asList(
                                "951 com",
                                "900 google.mail.com",
                                "1 intel.mail.com",
                                "5 org",
                                "5 wiki.org",
                                "901 mail.com",
                                "50 yahoo.com")));
    }
}
