package g1401_1500.s1476_subrectangle_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SubrectangleQueriesTest {
    @Test
    void subrectangleQueriesTest() {
        SubrectangleQueries subrectangleQueries =
                new SubrectangleQueries(new int[][] {{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}});
        assertThat(subrectangleQueries.getValue(0, 2), equalTo(1));
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        assertThat(subrectangleQueries.getValue(0, 2), equalTo(5));
        assertThat(subrectangleQueries.getValue(3, 1), equalTo(5));
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        assertThat(subrectangleQueries.getValue(3, 1), equalTo(10));
        assertThat(subrectangleQueries.getValue(0, 2), equalTo(5));
    }

    @Test
    void subrectangleQueriesTest2() {
        SubrectangleQueries subrectangleQueries =
                new SubrectangleQueries(new int[][] {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}});
        assertThat(subrectangleQueries.getValue(0, 0), equalTo(1));
        subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100);
        assertThat(subrectangleQueries.getValue(0, 0), equalTo(100));
        assertThat(subrectangleQueries.getValue(2, 2), equalTo(100));
        subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20);
        assertThat(subrectangleQueries.getValue(2, 2), equalTo(20));
    }
}
