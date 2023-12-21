package g2201_2300.s2241_design_an_atm_machine;

// #Medium #Array #Greedy #Design #2022_06_08_Time_192_ms_(24.16%)_Space_120.4_MB_(5.07%)

public class ATM {
    private int[] nominals;
    private long[] counts;

    public ATM() {
        nominals = new int[] {20, 50, 100, 200, 500};
        counts = new long[5];
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            counts[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] delivery = new int[5];
        long currentAmount = amount;
        for (int i = 4; i >= 0; i--) {
            if (currentAmount > nominals[i] * counts[i]) {
                delivery[i] = (int) counts[i];
            } else {
                delivery[i] = (int) currentAmount / nominals[i];
            }
            currentAmount += (long) -nominals[i] * delivery[i];
            if (currentAmount == 0) {
                break;
            }
        }
        if (currentAmount > 0) {
            return new int[] {-1};
        }
        for (int i = 0; i < 5; i++) {
            counts[i] += -delivery[i];
        }
        return delivery;
    }
}

/*
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
