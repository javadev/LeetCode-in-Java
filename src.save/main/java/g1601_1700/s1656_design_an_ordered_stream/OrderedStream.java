package g1601_1700.s1656_design_an_ordered_stream;

// #Easy #Array #Hash_Table #Design #Data_Stream
// #2022_04_23_Time_95_ms_(74.07%)_Space_84.5_MB_(69.74%)

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    private String[] str;
    private int ptr = 0;

    public OrderedStream(int n) {
        this.str = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        this.str[idKey - 1] = value;
        List<String> list = new ArrayList<>();
        while (ptr < str.length && str[ptr] != null) {
            list.add(str[ptr]);
            ptr++;
        }
        return list;
    }
}

/*
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
