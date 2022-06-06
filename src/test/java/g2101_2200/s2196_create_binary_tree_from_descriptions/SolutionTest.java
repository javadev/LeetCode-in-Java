package g2101_2200.s2196_create_binary_tree_from_descriptions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void createBinaryTree() {
        assertThat(
                new Solution()
                        .createBinaryTree(
                                new int[][] {
                                    {20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}
                                })
                        .toString(),
                equalTo("50,20,15,17,80,19,null"));
    }

    @Test
    void createBinaryTree2() {
        assertThat(
                new Solution()
                        .createBinaryTree(new int[][] {{1, 2, 1}, {2, 3, 0}, {3, 4, 1}})
                        .toString(),
                equalTo("1,2,null,3,4,null,null"));
    }
}
