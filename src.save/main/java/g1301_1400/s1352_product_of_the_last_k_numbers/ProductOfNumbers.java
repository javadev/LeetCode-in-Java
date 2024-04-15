package g1301_1400.s1352_product_of_the_last_k_numbers;

// #Medium #Array #Math #Design #Queue #Data_Stream
// #2022_03_21_Time_24_ms_(60.43%)_Space_75.7_MB_(61.31%)

import java.util.ArrayList;
import java.util.List;

public class ProductOfNumbers {

    private List<Integer> list = new ArrayList<>();

    public void add(int num) {
        if (num > 0 && !list.isEmpty()) {
            list.add(list.get(list.size() - 1) * num);
        } else {
            list = new ArrayList<>();
            list.add(1);
        }
    }

    public int getProduct(int k) {
        int size = list.size();
        return k >= size ? 0 : (list.get(size - 1) / list.get(size - k - 1));
    }
}
