package g2501_2600.s2526_find_consecutive_integers_from_a_data_stream;

// #Medium #Hash_Table #Design #Counting #Queue #Data_Stream
// #2023_04_19_Time_32_ms_(94.65%)_Space_80.2_MB_(39.13%)

public class DataStream {
    private final int value;
    private final int k;
    private int count;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
    }

    public boolean consec(int num) {
        count = num == value ? count + 1 : 0;
        return count >= k;
    }
}

/*
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
