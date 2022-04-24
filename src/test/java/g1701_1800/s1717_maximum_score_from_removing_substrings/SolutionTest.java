package g1701_1800.s1717_maximum_score_from_removing_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumGain() {
        assertThat(new Solution().maximumGain("cdbcbbaaabab", 4, 5), equalTo(19));
    }

    @Test
    void maximumGain2() {
        assertThat(new Solution().maximumGain("aabbaaxybbaabb", 5, 4), equalTo(20));
    }
}
