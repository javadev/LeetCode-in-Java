package g2601_2700.s2642_design_graph_with_shortest_path_calculator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class GraphTest {
    @Test
    void graphTest() {
        Graph g =
                new Graph(
                        4,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,2,5],[0,1,2],[1,2,1],[3,0,3]"));
        assertThat(g.shortestPath(3, 2), equalTo(6));
        assertThat(g.shortestPath(0, 3), equalTo(-1));
        g.addEdge(new int[] {1, 3, 4});
        assertThat(g.shortestPath(0, 3), equalTo(6));
    }
}
