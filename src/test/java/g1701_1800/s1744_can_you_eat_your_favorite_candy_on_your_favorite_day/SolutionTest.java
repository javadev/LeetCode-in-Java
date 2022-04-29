package g1701_1800.s1744_can_you_eat_your_favorite_candy_on_your_favorite_day;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canEat() {
        assertThat(
                new Solution()
                        .canEat(
                                new int[] {7, 4, 5, 3, 8},
                                new int[][] {{0, 2, 2}, {4, 2, 4}, {2, 13, 1000000000}}),
                equalTo(new boolean[] {true, false, true}));
    }

    @Test
    void canEat2() {
        assertThat(
                new Solution()
                        .canEat(
                                new int[] {5, 2, 6, 4, 1},
                                new int[][] {
                                    {3, 1, 2}, {4, 10, 3}, {3, 10, 100}, {4, 100, 30}, {1, 3, 1}
                                }),
                equalTo(new boolean[] {false, true, true, false, false}));
    }
}
