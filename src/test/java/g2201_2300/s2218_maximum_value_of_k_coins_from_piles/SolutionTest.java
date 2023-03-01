package g2201_2300.s2218_maximum_value_of_k_coins_from_piles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValueOfCoins() {
        assertThat(
                new Solution()
                        .maxValueOfCoins(
                                Arrays.asList(Arrays.asList(1, 100, 3), Arrays.asList(7, 8, 9)), 2),
                equalTo(101));
    }

    @Test
    void maxValueOfCoins2() {
        assertThat(
                new Solution()
                        .maxValueOfCoins(
                                Arrays.asList(
                                        Collections.singletonList(100),
                                        Collections.singletonList(100),
                                        Collections.singletonList(100),
                                        Collections.singletonList(100),
                                        Collections.singletonList(100),
                                        Collections.singletonList(100),
                                        Arrays.asList(1, 1, 1, 1, 1, 1, 700)),
                                7),
                equalTo(706));
    }
}
