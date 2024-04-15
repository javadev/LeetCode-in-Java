package g1901_2000.s1912_design_movie_rental_system;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class MovieRentingSystemTest {
    @Test
    void movieRentingSystemTest() {
        MovieRentingSystem movieRentingSystem =
                new MovieRentingSystem(
                        3,
                        new int[][] {
                            {0, 1, 5}, {0, 2, 6}, {0, 3, 7}, {1, 1, 4}, {1, 2, 7}, {2, 1, 5}
                        });
        assertThat(movieRentingSystem.search(1), equalTo(Arrays.asList(1, 0, 2)));
        movieRentingSystem.rent(0, 1);
        movieRentingSystem.rent(1, 2);
        assertThat(
                movieRentingSystem.report(),
                equalTo(Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2))));
        movieRentingSystem.drop(1, 2);
        assertThat(movieRentingSystem.search(2), equalTo(Arrays.asList(0, 1)));
    }
}
