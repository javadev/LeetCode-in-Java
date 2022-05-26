package g2001_2100.s2043_simple_bank_system;

// #Medium #Array #Hash_Table #Design #Simulation
// #2022_05_26_Time_159_ms_(48.01%)_Space_133.1_MB_(20.58%)

public class Bank {
    private final long[] accounts;

    public Bank(long[] balance) {
        accounts = balance;
    }

    private boolean validate(int account, long money, boolean withdraw) {
        return account < accounts.length && (!withdraw || accounts[account] >= money);
    }

    public boolean transfer(int account1, int account2, long money) {
        if (validate(account1 - 1, money, true) && validate(account2 - 1, 0, false)) {
            accounts[account1 - 1] -= money;
            accounts[account2 - 1] += money;
            return true;
        }
        return false;
    }

    public boolean deposit(int account, long money) {
        if (validate(account - 1, money, false)) {
            accounts[account - 1] += money;
            return true;
        }
        return false;
    }

    public boolean withdraw(int account, long money) {
        if (validate(account - 1, money, true)) {
            accounts[account - 1] -= money;
            return true;
        }
        return false;
    }
}
