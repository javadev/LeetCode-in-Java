package g3801_3900.s3827_count_monobit_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countMonobit() {
        assertThat(new Solution().countMonobit(1), equalTo(2));
    }

    @Test
    void countMonobit2() {
        assertThat(new Solution().countMonobit(4), equalTo(3));
    }
}
