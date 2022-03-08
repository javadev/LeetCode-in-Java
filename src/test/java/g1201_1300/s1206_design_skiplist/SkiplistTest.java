package g1201_1300.s1206_design_skiplist;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SkiplistTest {
    @Test
    void skiplist() {
        Skiplist skiplist = new Skiplist();
        skiplist.add(1);
        skiplist.add(2);
        skiplist.add(3);
        assertThat(skiplist.search(0), equalTo(false));
        skiplist.add(4);
        assertThat(skiplist.search(1), equalTo(true));
        assertThat(skiplist.erase(0), equalTo(false));
        assertThat(skiplist.erase(1), equalTo(true));
        assertThat(skiplist.search(1), equalTo(false));
    }
}
