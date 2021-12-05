package g0101_0200.s0146_lru_cache_medium_top_100_liked_questions_top_interview_questions_hash_table_design_linked_list_doubly_linked_list;

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
