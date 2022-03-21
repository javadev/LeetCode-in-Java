package g1301_1400.s1357_apply_discount_every_n_orders;

// #Medium #Array #Hash_Table #Design #2022_03_21_Time_209_ms_(27.73%)_Space_74.4_MB_(74.79%)

import java.util.Arrays;

public class Cashier {

    private int customer = 1;
    private final int n;
    private final double discount;
    private final int[] products;
    private final int[] prices;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = (double) discount;
        this.products = products;
        this.prices = prices;
    }

    public double getBill(int[] product, int[] amount) {
        double bill = 0.0;
        int[] productsInt = this.products;
        Integer[] products = Arrays.stream(productsInt).boxed().toArray(Integer[]::new);
        int[] prices = this.prices;
        for (int i = 0; i < product.length; i++) {
            int ithAmount = amount[i];
            int id = product[i];
            int price = prices[Arrays.asList(products).indexOf(id)];
            bill += price * ithAmount;
        }
        if (this.customer % n == 0) {
            this.customer++;
            return discounted(this.discount, bill);
        }
        this.customer++;
        return bill;
    }

    public double discounted(double discount, double price) {
        return price * (1 - (discount / 100));
    }
}
