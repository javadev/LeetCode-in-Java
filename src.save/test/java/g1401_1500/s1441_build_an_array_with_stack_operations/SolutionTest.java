package g1401_1500.s1441_build_an_array_with_stack_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void buildArray() {
        assertThat(
                new Solution().buildArray(new int[] {1, 3}, 3),
                equalTo(Arrays.asList("Push", "Push", "Pop", "Push")));
    }

    @Test
    void buildArray2() {
        assertThat(
                new Solution().buildArray(new int[] {1, 2, 3}, 3),
                equalTo(Arrays.asList("Push", "Push", "Push")));
    }

    @Test
    void buildArray3() {
        assertThat(
                new Solution().buildArray(new int[] {1, 2}, 4),
                equalTo(Arrays.asList("Push", "Push")));
    }
}
