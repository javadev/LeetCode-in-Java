package g0101_0200.s0146_lru_cache;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Design #Linked_List
// #Doubly_Linked_List

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
