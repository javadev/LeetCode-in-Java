package g0101_0200.s0146_lru_cache;

class LruCacheNode {
    int key;
    int value;
    LruCacheNode prev;
    LruCacheNode next;

    public LruCacheNode(int k, int v) {
        key = k;
        value = v;
    }
}
