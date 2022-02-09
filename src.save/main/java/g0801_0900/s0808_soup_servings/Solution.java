package g0801_0900.s0808_soup_servings;

// #Medium #Dynamic_Programming #Math #Probability_and_Statistics

public class Solution {
    public double soupServings(int n) {
        return solve(n);
    }

    private double solve(int n) {
        n = n / 25 + (n % 25 > 0 ? 1 : 0);
        if (n >= 500) {
            return 1.0;
        }
        return find(n, n, new Double[n + 1][n + 1]);
    }

    private double find(int a, int b, Double[][] mem) {
        if (a <= 0 && b <= 0) {
            return 0.5;
        } else if (a <= 0) {
            return 1;
        } else if (b <= 0) {
            return 0;
        }
        double prob;
        if (mem[a][b] != null) {
            return mem[a][b];
        }
        prob = find(a - 4, b, mem);
        prob += find(a - 3, b - 1, mem);
        prob += find(a - 2, b - 2, mem);
        prob += find(a - 1, b - 3, mem);
        mem[a][b] = 0.25 * prob;
        return mem[a][b];
    }

    private double find(int a, int b) {
        if (a <= 0 && b <= 0) {
            return 0.5;
        } else if (a <= 0) {
            return 1;
        } else if (b <= 0) {
            return 0;
        }
        double prob;
        prob = find(a - 100, b);
        prob += find(a - 75, b - 25);
        prob += find(a - 50, b - 50);
        prob += find(a - 25, b - 75);
        return 0.25 * prob;
    }
}
