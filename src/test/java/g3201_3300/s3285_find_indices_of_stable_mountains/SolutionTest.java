package g3201_3300.s3285_find_indices_of_stable_mountains;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stableMountains() {
        assertThat(
                new Solution().stableMountains(new int[] {1, 2, 3, 4, 5}, 2),
                equalTo(List.of(3, 4)));
    }

    @Test
    void stableMountains2() {
        assertThat(
                new Solution().stableMountains(new int[] {10, 1, 10, 1, 10}, 3),
                equalTo(List.of(1, 3)));
    }

    @Test
    void stableMountains3() {
        assertThat(
                new Solution().stableMountains(new int[] {10, 1, 10, 1, 10}, 10),
                equalTo(List.of()));
    }
}
