package g1901_2000.s1993_operations_on_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class LockingTreeTest {
    @Test
    void lockingTree() {
        LockingTree lockingTree = new LockingTree(new int[] {-1, 0, 0, 1, 1, 2, 2});
        // return true because node 2 is unlocked.
        assertThat(lockingTree.lock(2, 2), equalTo(true));
        // Node 2 will now be locked by user 2.
        // return false because user 3 cannot unlock a node locked by user 2.
        assertThat(lockingTree.unlock(2, 3), equalTo(false));
        // return true because node 2 was previously locked by user 2.
        assertThat(lockingTree.unlock(2, 2), equalTo(true));
        // Node 2 will now be unlocked.
        // return true because node 4 is unlocked.
        assertThat(lockingTree.lock(4, 5), equalTo(true));
        // Node 4 will now be locked by user 5.
        lockingTree.upgrade(0, 1);
        // Node 0 will now be locked by user 1 and node 4 will now be unlocked.
        // return false because node 0 is already locked.
        assertThat(lockingTree.lock(0, 1), equalTo(false));
    }
}
