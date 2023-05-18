package g1201_1300.s1263_minimum_moves_to_move_a_box_to_their_target_location;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPushBox() {
        assertThat(
                new Solution()
                        .minPushBox(
                                new char[][] {
                                    {'#', '#', '#', '#', '#', '#'},
                                    {'#', 'T', '#', '#', '#', '#'},
                                    {'#', '.', '.', 'B', '.', '#'},
                                    {'#', '.', '#', '#', '.', '#'},
                                    {'#', '.', '.', '.', 'S', '#'},
                                    {'#', '#', '#', '#', '#', '#'}
                                }),
                equalTo(3));
    }

    @Test
    void minPushBox2() {
        assertThat(
                new Solution()
                        .minPushBox(
                                new char[][] {
                                    {'#', '#', '#', '#', '#', '#'},
                                    {'#', 'T', '#', '#', '#', '#'},
                                    {'#', '.', '.', 'B', '.', '#'},
                                    {'#', '#', '#', '#', '.', '#'},
                                    {'#', '.', '.', '.', 'S', '#'},
                                    {'#', '#', '#', '#', '#', '#'}
                                }),
                equalTo(-1));
    }

    @Test
    void minPushBox3() {
        assertThat(
                new Solution()
                        .minPushBox(
                                new char[][] {
                                    {'#', '#', '#', '#', '#', '#'},
                                    {'#', 'T', '.', '.', '#', '#'},
                                    {'#', '.', '#', 'B', '.', '#'},
                                    {'#', '.', '.', '.', '.', '#'},
                                    {'#', '.', '.', '.', 'S', '#'},
                                    {'#', '#', '#', '#', '#', '#'}
                                }),
                equalTo(5));
    }
}
