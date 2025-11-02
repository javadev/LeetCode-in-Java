package g3701_3800.s3731_find_missing_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMissingElements() {
        assertThat(new Solution().findMissingElements(new int[] {1, 4, 2, 5}), equalTo(List.of(3)));
    }

    @Test
    void findMissingElements2() {
        assertThat(new Solution().findMissingElements(new int[] {7, 8, 6, 9}), equalTo(List.of()));
    }

    @Test
    void findMissingElements3() {
        assertThat(new Solution().findMissingElements(new int[] {5, 1}), equalTo(List.of(2, 3, 4)));
    }
}
