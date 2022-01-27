package g0701_0800.s0729_my_calendar_i;

import java.util.TreeSet;

// #Medium #Design #Ordered_Set #Segment_Tree

public class MyCalendar {
    static class Meeting implements Comparable<Meeting> {
        public final int start;
        public final int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

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
