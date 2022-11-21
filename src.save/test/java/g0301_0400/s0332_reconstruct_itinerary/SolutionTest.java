package g0301_0400.s0332_reconstruct_itinerary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findItinerary() {
        List<List<String>> input =
                Arrays.asList(
                        Arrays.asList("MUC", "LHR"),
                        Arrays.asList("JFK", "MUC"),
                        Arrays.asList("SFO", "SJC"),
                        Arrays.asList("LHR", "SFO"));
        assertThat(
                new Solution().findItinerary(input),
                equalTo(Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC")));
    }

    @Test
    void findItinerary2() {
        List<List<String>> input =
                Arrays.asList(
                        Arrays.asList("JFK", "SFO"),
                        Arrays.asList("JFK", "ATL"),
                        Arrays.asList("SFO", "ATL"),
                        Arrays.asList("ATL", "JFK"),
                        Arrays.asList("ATL", "SFO"));
        assertThat(
                new Solution().findItinerary(input),
                equalTo(Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO")));
    }
}
