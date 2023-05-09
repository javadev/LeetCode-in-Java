package g1301_1400.s1357_apply_discount_every_n_orders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class CashierTest {
    @Test
    void cashierTest() {
        Cashier cashier =
                new Cashier(
                        3,
                        50,
                        new int[] {1, 2, 3, 4, 5, 6, 7},
                        new int[] {100, 200, 300, 400, 300, 200, 100});
        assertThat(cashier.getBill(new int[] {1, 2}, new int[] {1, 2}), equalTo(500.0));
        assertThat(cashier.getBill(new int[] {3, 7}, new int[] {10, 10}), equalTo(4000.0));
        assertThat(
                cashier.getBill(new int[] {1, 2, 3, 4, 5, 6, 7}, new int[] {1, 1, 1, 1, 1, 1, 1}),
                equalTo(800.0));
        assertThat(cashier.getBill(new int[] {4}, new int[] {10}), equalTo(4000.0));
        assertThat(cashier.getBill(new int[] {7, 3}, new int[] {10, 10}), equalTo(4000.0));
        assertThat(
                cashier.getBill(
                        new int[] {7, 5, 3, 1, 6, 4, 2}, new int[] {10, 10, 10, 9, 9, 9, 7}),
                equalTo(7350.0));
        cashier.getBill(new int[] {2, 3, 5}, new int[] {5, 3, 2});
    }
}
