package g2101_2200.s2102_sequentially_ordinal_rank_tracker;

// #Hard #Design #Heap_Priority_Queue #Ordered_Set #Data_Stream
// #2022_05_31_Time_194_ms_(79.48%)_Space_79.6_MB_(69.32%)

import java.util.TreeSet;

public class SORTracker {
    static class Location {
        String name;
        int score;

        public Location(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }

    TreeSet<Location> tSet1;
    TreeSet<Location> tSet2;

    public SORTracker() {
        tSet1 =
                new TreeSet<>(
                        (a, b) -> {
                            if (a.score != b.score) {
                                return b.getScore() - a.getScore();
                            } else {
                                return a.getName().compareTo(b.getName());
                            }
                        });

        tSet2 =
                new TreeSet<>(
                        (a, b) -> {
                            if (a.score != b.score) {
                                return b.getScore() - a.getScore();
                            } else {
                                return a.getName().compareTo(b.getName());
                            }
                        });
    }

    public void add(String name, int score) {
        tSet1.add(new Location(name, score));
        tSet2.add(tSet1.pollLast());
    }

    public String get() {
        Location res = tSet2.pollFirst();
        tSet1.add(res);
        assert res != null;
        return res.name;
    }
}
