package g0401_0500.s0460_lfu_cache;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class LFUCacheTest {
    @Test
    void lfuCache() {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        assertThat(lfuCache.get(1), equalTo(1));
        lfuCache.put(3, 3);
        assertThat(lfuCache.get(2), equalTo(-1));
        assertThat(lfuCache.get(3), equalTo(3));
        lfuCache.put(4, 4);
        assertThat(lfuCache.get(1), equalTo(-1));
        assertThat(lfuCache.get(3), equalTo(3));
        assertThat(lfuCache.get(4), equalTo(4));
    }
}
