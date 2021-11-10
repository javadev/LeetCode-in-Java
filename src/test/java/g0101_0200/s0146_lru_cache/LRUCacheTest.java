package g0101_0200.s0146_lru_cache;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class LRUCacheTest {
    @Test
    public void lRUCache() {
        LRUCache lRUCache = new LRUCache(2);
        // cache is {1=1}
        lRUCache.put(1, 1);
        // cache is {1=1, 2=2}
        lRUCache.put(2, 2);
        // return 1
        assertThat(lRUCache.get(1), equalTo(1));
        // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.put(3, 3);
        // returns -1 (not found)
        assertThat(lRUCache.get(2), equalTo(-1));
        // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.put(4, 4);
        // return -1 (not found)
        assertThat(lRUCache.get(1), equalTo(-1));
        // return 3
        assertThat(lRUCache.get(3), equalTo(3));
        // return 4
        assertThat(lRUCache.get(4), equalTo(4));
    }
}
