package g1401_1500.s1436_destination_city;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void destCity() {
        List<List<String>> input =
                Arrays.asList(
                        Arrays.asList("London", "New York"),
                        Arrays.asList("New York", "Lima"),
                        Arrays.asList("Lima", "Sao Paulo"));
        assertThat(new Solution().destCity(input), equalTo("Sao Paulo"));
    }

    @Test
    void destCity2() {
        List<List<String>> input =
                Arrays.asList(
                        Arrays.asList("B", "C"), Arrays.asList("D", "B"), Arrays.asList("C", "A"));
        assertThat(new Solution().destCity(input), equalTo("A"));
    }

    @Test
    void destCity3() {
        List<List<String>> input = Arrays.asList(Arrays.asList("A", "Z"));
        assertThat(new Solution().destCity(input), equalTo("Z"));
    }
}
