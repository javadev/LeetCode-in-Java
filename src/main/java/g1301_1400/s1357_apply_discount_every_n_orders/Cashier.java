package g1301_1400.s1357_apply_discount_every_n_orders;

// #Medium #Array #Hash_Table #Design #2022_03_21_Time_174_ms_(58.82%)_Space_125.4_MB_(66.39%)

import java.util.HashMap;
import java.util.Map;

public class Cashier {
    private Map<Integer, Integer> map;
    private int nthCustomer;
    private int customerCountTrack;
    private double discountPercent;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        map = new HashMap<>();
        nthCustomer = n;
        customerCountTrack = 0;
        discountPercent = discount * .01;
        for (int i = 0; i < products.length; i++) {
            map.put(products[i], prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        customerCountTrack++;
        double sum = 0;
        for (int i = 0; i < product.length; i++) {
            sum += map.get(product[i]) * amount[i];
        }
        // discount customer
        if (customerCountTrack % nthCustomer == 0) {
            return sum - (sum * discountPercent);
        }
        return sum;
    }
}
