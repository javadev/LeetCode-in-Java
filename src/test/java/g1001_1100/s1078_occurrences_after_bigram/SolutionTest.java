package g1001_1100.s1078_occurrences_after_bigram;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findOcurrences() {
        assertThat(
                new Solution()
                        .findOcurrences("alice is a good girl she is a good student", "a", "good"),
                equalTo(new String[] {"girl", "student"}));
    }

    @Test
    void findOcurrences2() {
        assertThat(
                new Solution().findOcurrences("we will we will rock you", "we", "will"),
                equalTo(new String[] {"we", "rock"}));
    }
}
