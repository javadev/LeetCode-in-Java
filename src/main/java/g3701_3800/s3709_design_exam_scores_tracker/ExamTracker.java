package g3701_3800.s3709_design_exam_scores_tracker;

// #Medium #Array #Binary_Search #Design #Prefix_Sum #Biweekly_Contest_167
// #2025_10_14_Time_102_ms_(99.55%)_Space_101.26_MB_(83.89%)

import java.util.ArrayList;

@SuppressWarnings("java:S6213")
public class ExamTracker {

    private final ArrayList<Integer> ti;
    private final ArrayList<Long> pr;

    public ExamTracker() {
        ti = new ArrayList<>();
        pr = new ArrayList<>();
    }

    public void record(int time, int score) {
        ti.add(time);
        long pv = pr.isEmpty() ? 0L : pr.get(pr.size() - 1);
        pr.add(pv + (long) score);
    }

    public long totalScore(int startTime, int endTime) {
        int n = ti.size();
        if (n == 0) {
            return 0L;
        }
        int l = lB(startTime);
        int rE = fGt(endTime);
        int r = rE - 1;
        if (l > r) {
            return 0L;
        }
        long sR = pr.get(r);
        long sL = (l > 0) ? pr.get(l - 1) : 0L;
        return sR - sL;
    }

    private int lB(int t) {
        int l = 0;
        int r = ti.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (ti.get(m) < t) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    private int fGt(int t) {
        int l = 0;
        int r = ti.size();
        while (l < r) {
            int m = (l + r) >>> 1;
            if (ti.get(m) <= t) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}

/*
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */
