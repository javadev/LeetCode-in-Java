package g3201_3300.s3273_minimum_amount_of_damage_dealt_to_bob;

// #Hard #2024_09_02_Time_221_ms_(100.00%)_Space_59.9_MB_(100.00%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    int total;
    int power;

    private class Pair implements Comparable<Pair> {
        int health;
        int damage;

        Pair(int health, int damage) {
            this.health = health;
            this.damage = damage;
        }

        @Override
        public int compareTo(Pair p) {
            int thisHits = (int) Math.ceil((double) this.health / power);
            int otherHits = (int) Math.ceil((double) p.health / power);
            double thisTotalDamage = this.damage * 1.0 / thisHits;
            double otherTotalDamage = p.damage * 1.0 / otherHits;
            return Double.compare(otherTotalDamage, thisTotalDamage);
        }
    }

    public long minDamage(int power, int[] damage, int[] health) {
        this.power = power;
        total = 0;
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < damage.length; i++) {
            pairs.add(new Pair(health[i], damage[i]));
        }
        Collections.sort(pairs);
        long totalDamage = 0;
        int hitsRequired = 0;
        for (Pair pair : pairs) {
            hitsRequired += (int) Math.ceil((double) pair.health / power);
            totalDamage += (long) hitsRequired * pair.damage;
        }
        return totalDamage;
    }
}
