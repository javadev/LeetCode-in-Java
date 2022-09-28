package g2001_2100.s2043_simple_bank_system;

// #Medium #Array #Hash_Table #Design #Simulation
// #2022_05_27_Time_128_ms_(72.30%)_Space_81_MB_(76.62%)

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

/*
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
