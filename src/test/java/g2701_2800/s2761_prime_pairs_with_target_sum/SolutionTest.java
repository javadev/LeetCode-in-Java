package g2701_2800.s2761_prime_pairs_with_target_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPrimePairs() {
        assertThat(
                new Solution().findPrimePairs(10),
                equalTo(Arrays.asList(Arrays.asList(3, 7), Arrays.asList(5, 5))));
    }

    @Test
    void findPrimePairs2() {
        assertThat(new Solution().findPrimePairs(2), equalTo(List.of()));
    }
}
