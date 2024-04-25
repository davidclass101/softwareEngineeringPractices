package base.sweng;

import java.util.Date;

public class LibraryBooking {

    private int bookingId;
    private String studentNumber;
    private int roomId;
    private Date bookingDate;

    // Constructor
public LibraryBooking(int bookingId, String studentNumber, int roomId, Date bookingDate) {
        this.bookingId = bookingId;
        this.studentNumber = studentNumber;
        this.roomId = roomId;
        this.bookingDate = bookingDate;
    }

    // Getters
    public int getBookingId() {
        return bookingId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getRoomId() {
        return roomId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    // Setters

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public boolean isValidInput(String input, int maxLength) {
        return input != null && input.length() <= maxLength;
    }

}
