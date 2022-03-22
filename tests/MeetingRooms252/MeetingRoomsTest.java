package MeetingRooms252;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsTest {

    @Test
    public void testNoIntervals(){
        assertTrue(MeetingRooms.canAttendMeetings(new int[][]{}));
    }

    @Test
    public void testOnlyOneMeeting(){
        assertTrue(MeetingRooms.canAttendMeetings(new int[][]{new int[]{2, 3}}));
    }

    @Test
    public void testMeetingsNoConflicts(){
        assertTrue(MeetingRooms.canAttendMeetings(new int[][]{
                new int[]{100, 624},
                new int[]{0, 15},
                new int[]{624, 625},
                new int[]{32, 79}
        }));
    }

    @Test
    public void testMeetingsConflictOverlap(){
        assertFalse(MeetingRooms.canAttendMeetings(new int[][]{
                new int[]{2, 415},
                new int[]{114, 588}
        }));
    }

    @Test
    public void testMeetingsConflictDuplicateTime(){
        assertFalse(MeetingRooms.canAttendMeetings(new int[][]{
                new int[]{6, 8},
                new int[]{15, 18},
                new int[]{6, 8}
        }));
    }

    @Test
    public void testMeetingsConflictBetween(){
        assertFalse(MeetingRooms.canAttendMeetings(new int[][]{
                new int[]{18, 32},
                new int[]{20, 25},
                new int[]{4, 6}
        }));
    }
}