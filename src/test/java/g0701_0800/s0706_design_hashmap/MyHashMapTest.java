package g0701_0800.s0706_design_hashmap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyHashMapTest {
    @Test
    void myHashMapTest() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assertThat(myHashMap.get(1), equalTo(1));
        assertThat(myHashMap.get(3), equalTo(-1));
        myHashMap.put(2, 1);
        assertThat(myHashMap.get(2), equalTo(1));
        myHashMap.remove(2);
        assertThat(myHashMap.get(2), equalTo(-1));
    }
}
