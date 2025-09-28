package g3601_3700.s3692_majority_frequency_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void majorityFrequencyGroup() {
        assertThat(new Solution().majorityFrequencyGroup("aaabbbccdddde"), equalTo("ab"));
    }

    @Test
    void majorityFrequencyGroup2() {
        assertThat(new Solution().majorityFrequencyGroup("abcd"), equalTo("abcd"));
    }

    @Test
    void majorityFrequencyGroup3() {
        assertThat(new Solution().majorityFrequencyGroup("pfpfgi"), equalTo("fp"));
    }
}
