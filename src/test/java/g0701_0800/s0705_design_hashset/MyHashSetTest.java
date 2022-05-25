package g0701_0800.s0705_design_hashset;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyHashSetTest {
    @Test
    void myHashSetTest() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        assertThat(myHashSet.contains(1), equalTo(true));
        assertThat(myHashSet.contains(3), equalTo(false));
        myHashSet.add(2);
        assertThat(myHashSet.contains(2), equalTo(true));
        myHashSet.remove(2);
        assertThat(myHashSet.contains(2), equalTo(false));
    }
}
