package g2601_2700.s2678_number_of_senior_citizens;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSeniors() {
        assertThat(
                new Solution()
                        .countSeniors(
                                new String[] {
                                    "7868190130M7522", "5303914400F9211", "9273338290F4010"
                                }),
                equalTo(2));
    }

    @Test
    void countSeniors2() {
        assertThat(
                new Solution().countSeniors(new String[] {"1313579440F2036", "2921522980M5644"}),
                equalTo(0));
    }
}
