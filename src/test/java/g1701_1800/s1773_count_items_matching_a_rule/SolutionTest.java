package g1701_1800.s1773_count_items_matching_a_rule;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countMatches() {
        assertThat(
                new Solution()
                        .countMatches(
                                Arrays.asList(
                                        Arrays.asList("phone", "blue", "pixel"),
                                        Arrays.asList("computer", "silver", "lenovo"),
                                        Arrays.asList("phone", "gold", "iphone")),
                                "color",
                                "silver"),
                equalTo(1));
    }

    @Test
    void countMatches2() {
        assertThat(
                new Solution()
                        .countMatches(
                                Arrays.asList(
                                        Arrays.asList("phone", "blue", "pixel"),
                                        Arrays.asList("computer", "silver", "phone"),
                                        Arrays.asList("phone", "gold", "iphone")),
                                "type",
                                "phone"),
                equalTo(2));
    }
}
