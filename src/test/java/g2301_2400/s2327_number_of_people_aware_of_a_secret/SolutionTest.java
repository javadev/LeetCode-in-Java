package g2301_2400.s2327_number_of_people_aware_of_a_secret;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void peopleAwareOfSecret() {
        assertThat(new Solution().peopleAwareOfSecret(6, 2, 4), equalTo(5));
    }

    @Test
    void peopleAwareOfSecret2() {
        assertThat(new Solution().peopleAwareOfSecret(4, 1, 3), equalTo(6));
    }
}
