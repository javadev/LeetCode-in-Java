package g3001_3100.s3019_number_of_changing_keys;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countKeyChanges() {
        assertThat(new Solution().countKeyChanges("aAbBcC"), equalTo(2));
    }

    @Test
    void countKeyChanges2() {
        assertThat(new Solution().countKeyChanges("AaAaAaaA"), equalTo(0));
    }
}
