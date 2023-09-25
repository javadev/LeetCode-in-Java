package g2501_2600.s2502_design_memory_allocator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class AllocatorTest {
    @Test
    void allocator() {
        // Initialize a memory array of size 10. All memory units are initially free.
        Allocator loc = new Allocator(10);
        // The leftmost block's first index is 0. The memory array becomes [1,_,_,_,_,_,_,_,_,_]. We
        // return 0.
        assertThat(loc.allocate(1, 1), equalTo(0));
        // The leftmost block's first index is 1. The memory array becomes [1,2,_,_,_,_,_,_,_,_]. We
        // return 1.
        assertThat(loc.allocate(1, 2), equalTo(1));
        // The leftmost block's first index is 2. The memory array becomes [1,2,3,_,_,_,_,_,_,_]. We
        // return 2.
        assertThat(loc.allocate(1, 3), equalTo(2));
        // Free all memory units with mID 2. The memory array becomes [1,_, 3,_,_,_,_,_,_,_]. We
        // return 1 since there is only 1 unit with mID 2.
        loc.free(2);
        // The leftmost block's first index is 3. The memory array becomes [1,_,3,4,4,4,_,_,_,_]. We
        // return 3.
        assertThat(loc.allocate(3, 4), equalTo(3));
        // The leftmost block's first index is 1. The memory array becomes [1,1,3,4,4,4,_,_,_,_]. We
        // return 1.
        assertThat(loc.allocate(1, 1), equalTo(1));
        // The leftmost block's first index is 6. The memory array becomes [1,1,3,4,4,4,1,_,_,_]. We
        // return 6.
        assertThat(loc.allocate(1, 1), equalTo(6));
        // Free all memory units with mID 1. The memory array becomes [_,_,3,4,4,4,_,_,_,_]. We
        // return 3 since there are 3 units with mID 1.
        loc.free(1);
        // We can not find any free block with 10 consecutive free memory units, so we return -1.
        assertThat(loc.allocate(10, 2), equalTo(-1));
        // Free all memory units with mID 7. The memory array remains the same since there is no
        // memory unit with mID 7. We return 0.
        loc.free(7);
    }
}
