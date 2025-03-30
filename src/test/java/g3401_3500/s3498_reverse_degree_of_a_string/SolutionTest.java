package g3401_3500.s3498_reverse_degree_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseDegree() {
        assertThat(new Solution().reverseDegree("abc"), equalTo(148));
    }

    @Test
    void reverseDegree2() {
        assertThat(new Solution().reverseDegree("zaza"), equalTo(160));
    }
}
