package g1501_1600.s1557_minimum_number_of_vertices_to_reach_all_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSmallestSetOfVertices() {
        assertThat(
                new Solution()
                        .findSmallestSetOfVertices(
                                6,
                                Arrays.asList(
                                        Arrays.asList(0, 1),
                                        Arrays.asList(0, 2),
                                        Arrays.asList(2, 5),
                                        Arrays.asList(3, 4),
                                        Arrays.asList(4, 2))),
                equalTo(Arrays.asList(0, 3)));
    }

    @Test
    void findSmallestSetOfVertices2() {
        assertThat(
                new Solution()
                        .findSmallestSetOfVertices(
                                5,
                                Arrays.asList(
                                        Arrays.asList(0, 1),
                                        Arrays.asList(2, 1),
                                        Arrays.asList(3, 1),
                                        Arrays.asList(1, 4),
                                        Arrays.asList(2, 4))),
                equalTo(Arrays.asList(0, 2, 3)));
    }
}
