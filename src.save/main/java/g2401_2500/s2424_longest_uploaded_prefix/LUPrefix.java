package g2401_2500.s2424_longest_uploaded_prefix;

// #Medium #Binary_Search #Design #Heap_Priority_Queue #Union_Find #Ordered_Set #Segment_Tree
// #Binary_Indexed_Tree #2022_11_19_Time_35_ms_(99.68%)_Space_108.8_MB_(92.53%)

public class LUPrefix {
    private boolean[] res;
    private int count = 0;

    public LUPrefix(int n) {
        res = new boolean[n + 1];
    }

    public void upload(int video) {
        res[video - 1] = true;
    }

    public int longest() {
        while (res[count]) {
            count++;
        }
        return count;
    }
}

/*
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */
