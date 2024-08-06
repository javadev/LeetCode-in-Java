package g3201_3300.s3242_design_neighbor_sum_service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void neighborSum() {
        NeighborSum neighborSum = new NeighborSum(new int[][] {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}});
        assertThat(neighborSum.adjacentSum(1), equalTo(6));
        assertThat(neighborSum.adjacentSum(4), equalTo(16));
        assertThat(neighborSum.diagonalSum(4), equalTo(16));
        assertThat(neighborSum.diagonalSum(8), equalTo(4));
    }

    @Test
    void neighborSum2() {
        NeighborSum neighborSum =
                new NeighborSum(
                        new int[][] {{1, 2, 0, 3}, {4, 7, 15, 6}, {8, 9, 10, 11}, {12, 13, 14, 5}});
        assertThat(neighborSum.adjacentSum(15), equalTo(23));
        assertThat(neighborSum.diagonalSum(9), equalTo(45));
    }
}
