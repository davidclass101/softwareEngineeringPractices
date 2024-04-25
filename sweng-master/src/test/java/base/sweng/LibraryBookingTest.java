package base.sweng;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class LibraryBookingTest {

    // Test case for the constructor
    @Test
    public void testConstructor() {
        LibraryBooking booking = new LibraryBooking(1, "1234567890", 1, new Date());

        assertEquals(1, booking.getBookingId());
        assertEquals("1234567890", booking.getStudentNumber());
        assertEquals(1, booking.getRoomId());
        assertNotNull(booking.getBookingDate());
    }

    // Test case for setters

    @Test
    public void testSetBookingId() {
        LibraryBooking booking = new LibraryBooking(1, "1234567890", 1, new Date());

        booking.setBookingId(2);
        assertEquals(2, booking.getBookingId());
    }

    @Test
    public void testSetStudentNumber() {
        LibraryBooking booking = new LibraryBooking(1, "1234567890", 1, new Date());

        booking.setStudentNumber("0987654321");
        assertEquals("0987654321", booking.getStudentNumber());
    }

    @Test
    public void testSetRoomId() {
        LibraryBooking booking = new LibraryBooking(1, "1234567890", 1, new Date());

        booking.setRoomId(2);
        assertEquals(2, booking.getRoomId());
    }

    @Test
    public void testSetBookingDate() {
        LibraryBooking booking = new LibraryBooking(1, "1234567890", 1, new Date());
        Date newDate = new Date();

        booking.setBookingDate(newDate);
        assertEquals(newDate, booking.getBookingDate());
    }


}