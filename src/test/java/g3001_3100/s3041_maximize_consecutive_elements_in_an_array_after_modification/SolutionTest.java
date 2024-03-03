package g3001_3100.s3041_maximize_consecutive_elements_in_an_array_after_modification;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSelectedElements() {
        assertThat(new Solution().maxSelectedElements(new int[] {2, 1, 5, 1, 1}), equalTo(3));
    }

    @Test
    void maxSelectedElements2() {
        assertThat(new Solution().maxSelectedElements(new int[] {1, 4, 7, 10}), equalTo(1));
    }
}
