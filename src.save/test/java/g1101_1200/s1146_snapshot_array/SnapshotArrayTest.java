package g1101_1200.s1146_snapshot_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SnapshotArrayTest {
    @Test
    void snapshotArrayTest() {
        SnapshotArray snapshotArr = new SnapshotArray(3);
        snapshotArr.set(0, 5);
        assertThat(snapshotArr.snap(), equalTo(0));
        snapshotArr.set(0, 6);
        assertThat(snapshotArr.get(0, 0), equalTo(5));
    }
}
