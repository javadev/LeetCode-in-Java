package g2301_2400.s2336_smallest_number_in_infinite_set;

// #Medium #Hash_Table #Design #Heap_Priority_Queue
// #2022_07_13_Time_12_ms_(96.69%)_Space_54.8_MB_(57.87%)

public class SmallestInfiniteSet {
    private int[] set = new int[1001];
    private int ptr = 1;

    public SmallestInfiniteSet() {
        for (int i = 1; i <= 1000; i++) {
            set[i] = 1;
        }
    }

    public int popSmallest() {
        int val = -1;
        if (ptr > 0 && ptr <= 1000) {
            set[ptr] = 0;
            val = ptr++;
            while (ptr <= 1000 && set[ptr] == 0) {
                ptr++;
            }
        }
        return val;
    }

    public void addBack(int num) {
        if (set[num] == 0) {
            set[num] = 1;
            if (num < ptr) {
                ptr = num;
            }
        }
    }
}

/*
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
