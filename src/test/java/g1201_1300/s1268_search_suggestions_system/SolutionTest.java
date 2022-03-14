package g1201_1300.s1268_search_suggestions_system;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void suggestedProducts() {
        List<List<String>> expected =
                Arrays.asList(
                        Arrays.asList("mobile", "moneypot", "monitor"),
                        Arrays.asList("mobile", "moneypot", "monitor"),
                        Arrays.asList("mouse", "mousepad"),
                        Arrays.asList("mouse", "mousepad"),
                        Arrays.asList("mouse", "mousepad"));
        assertThat(
                new Solution()
                        .suggestedProducts(
                                new String[] {"mobile", "mouse", "moneypot", "monitor", "mousepad"},
                                "mouse"),
                equalTo(expected));
    }

    @Test
    void suggestedProducts2() {
        List<List<String>> expected =
                Arrays.asList(
                        Collections.singletonList("havana"),
                        Collections.singletonList("havana"),
                        Collections.singletonList("havana"),
                        Collections.singletonList("havana"),
                        Collections.singletonList("havana"),
                        Collections.singletonList("havana"));
        assertThat(
                new Solution().suggestedProducts(new String[] {"havana"}, "havana"),
                equalTo(expected));
    }

    @Test
    void suggestedProducts3() {
        List<List<String>> expected =
                Arrays.asList(
                        Arrays.asList("baggage", "bags", "banner"),
                        Arrays.asList("baggage", "bags", "banner"),
                        Arrays.asList("baggage", "bags"),
                        Collections.singletonList("bags"));
        assertThat(
                new Solution()
                        .suggestedProducts(
                                new String[] {"bags", "baggage", "banner", "box", "cloths"},
                                "bags"),
                equalTo(expected));
    }
}
