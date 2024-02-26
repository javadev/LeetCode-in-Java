package g1401_1500.s1483_kth_ancestor_of_a_tree_node;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class TreeAncestorTest {
    @Test
    void treeAncestor() {
        TreeAncestor treeAncestor = new TreeAncestor(7, new int[] {-1, 0, 0, 1, 1, 2, 2});
        assertThat(treeAncestor.getKthAncestor(3, 1), equalTo(1));
        assertThat(treeAncestor.getKthAncestor(5, 2), equalTo(0));
        assertThat(treeAncestor.getKthAncestor(6, 3), equalTo(-1));
    }

    @Test
    void treeAncestor2() {
        TreeAncestor treeAncestor =
                new TreeAncestor(
                        21,
                        new int[] {
                            -1, 0, 0, 1, 1, 2, 2, -1, 0, 0, 1, 1, 2, 2, -1, 0, 0, 1, 1, 2, 2
                        });
        assertThat(treeAncestor.getKthAncestor(3, 1), equalTo(1));
        assertThat(treeAncestor.getKthAncestor(5, 2), equalTo(0));
        assertThat(treeAncestor.getKthAncestor(6, 3), equalTo(-1));
    }
}
