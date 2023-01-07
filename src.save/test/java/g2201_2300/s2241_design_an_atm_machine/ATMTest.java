package g2201_2300.s2241_design_an_atm_machine;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ATMTest {
    @Test
    void atm() {
        ATM atm = new ATM();
        atm.deposit(new int[] {0, 0, 1, 2, 1});
        // Deposits 1 $100 banknote, 2 $200 banknotes,
        // and 1 $500 banknote.
        assertThat(atm.withdraw(600), equalTo(new int[] {0, 0, 1, 0, 1}));
        // Returns [0,0,1,0,1]. The machine uses 1 $100 banknote
        // and 1 $500 banknote. The banknotes left over in the
        // machine are [0,0,0,2,0].
        atm.deposit(new int[] {0, 1, 0, 1, 1});
        // Deposits 1 $50, $200, and $500 banknote.
        // The banknotes in the machine are now [0,1,0,3,1].
        assertThat(atm.withdraw(600), equalTo(new int[] {-1}));
        // Returns [-1]. The machine will try to use a $500 banknote
        // and then be unable to complete the remaining $100,
        // so the withdraw request will be rejected.
        // Since the request is rejected, the number of banknotes
        // in the machine is not modified.
        assertThat(atm.withdraw(550), equalTo(new int[] {0, 1, 0, 0, 1}));
        // Returns [0,1,0,0,1]. The machine uses 1 $50 banknote
        // and 1 $500 banknote.
    }
}
