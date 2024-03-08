package g2001_2100.s2086_minimum_number_of_buckets_required_to_collect_rainwater_from_houses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumBuckets() {
        assertThat(new Solution().minimumBuckets("H..H"), equalTo(2));
    }

    @Test
    void minimumBuckets2() {
        assertThat(new Solution().minimumBuckets(".H.H."), equalTo(1));
    }

    @Test
    void minimumBuckets3() {
        assertThat(new Solution().minimumBuckets(".HHH."), equalTo(-1));
    }
}
