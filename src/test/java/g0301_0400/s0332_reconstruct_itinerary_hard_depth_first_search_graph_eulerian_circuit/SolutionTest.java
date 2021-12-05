package g0301_0400.s0332_reconstruct_itinerary_hard_depth_first_search_graph_eulerian_circuit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findItinerary() {
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
}
