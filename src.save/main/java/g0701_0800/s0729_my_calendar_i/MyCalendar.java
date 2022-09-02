package g0701_0800.s0729_my_calendar_i;

// #Medium #Binary_Search #Design #Ordered_Set #Segment_Tree #Programming_Skills_II_Day_20
// #2022_03_25_Time_17_ms_(97.23%)_Space_43_MB_(87.36%)

import java.util.TreeSet;

@SuppressWarnings("java:S1210")
public class MyCalendar {
    static class Meeting implements Comparable<Meeting> {
        public final int start;
        public final int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting anotherMeeting) {
            return this.start - anotherMeeting.start;
        }
    }

    private final TreeSet<Meeting> meetings;

    public MyCalendar() {
        meetings = new TreeSet<>();
    }

    public boolean book(int start, int end) {
        Meeting meetingToBook = new Meeting(start, end);
        Meeting prevMeeting = meetings.floor(meetingToBook);
        Meeting nextMeeting = meetings.ceiling(meetingToBook);
        if ((prevMeeting == null || prevMeeting.end <= meetingToBook.start)
                && (nextMeeting == null || meetingToBook.end <= nextMeeting.start)) {

            meetings.add(meetingToBook);
            return true;
        }
        return false;
    }
}

/*
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
