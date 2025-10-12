package g3701_3800.s3709_design_exam_scores_tracker;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ExamTrackerTest {
    @Test
    void examTracker() {
        ExamTracker examTracker = new ExamTracker();
        // Alice takes a new exam at time 1, scoring 98.
        examTracker.record(1, 98);
        // Between time 1 and time 1, Alice took 1 exam at time 1, scoring 98. The total score is
        // 98.
        assertThat(examTracker.totalScore(1, 1), equalTo(98L));
        // Alice takes a new exam at time 5, scoring 99.
        examTracker.record(5, 99);
        // Between time 1 and time 3, Alice took 1 exam at time 1, scoring 98. The total score is
        // 98.
        assertThat(examTracker.totalScore(1, 3), equalTo(98L));
        // Between time 1 and time 5, Alice took 2 exams at time 1 and 5, scoring 98 and 99.
        // The total score is 98 + 99 = 197.
        assertThat(examTracker.totalScore(1, 5), equalTo(197L));
        // Alice did not take any exam between time 3 and time 4. Therefore, the answer is 0.
        assertThat(examTracker.totalScore(3, 4), equalTo(0L));
        // Between time 2 and time 5, Alice took 1 exam at time 5, scoring 99. The total score is
        // 99.
        assertThat(examTracker.totalScore(2, 5), equalTo(99L));
    }
}
