package base.sweng;

public class StudentApp {
    private String studentNumber;
    private String name;
    private String surname;
    private String dateOfBirth; // In format YYYY-MM-DD
    private String motivation;

    // Constants for validation
    private static final int MAX_LENGTH_NUMBER = 10;
    private static final int MAX_LENGTH_NAME = 50;
    private static final int MAX_LENGTH_SURNAME = 50;
    private static final int MAX_LENGTH_MOTIVATION = 500;

   // Constructor
    public StudentApp(String studentNumber, String name, String surname, String dateOfBirth, String motivation) {
        setStudentNumber(studentNumber);
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
        setMotivation(motivation);
    }

    private boolean isValidInput(String input, int maxLength) {
        return input != null && input.length() <= maxLength;
    }

    // Getters
    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMotivation() {
        return motivation;
    }

    // Setters
    public void setStudentNumber(String studentNumber) {
        if (isValidInput(studentNumber, MAX_LENGTH_NUMBER)) {
            this.studentNumber = studentNumber;
        } else {
            throw new IllegalArgumentException("Invalid student number");
        }
    }

    public void setName(String name) {
        if (isValidInput(name, MAX_LENGTH_NAME)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public void setSurname(String surname) {
        if (isValidInput(surname, MAX_LENGTH_SURNAME)) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Invalid surname");
        }
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMotivation(String motivation) {
        if (isValidInput(motivation, MAX_LENGTH_MOTIVATION)) {
            this.motivation = motivation;
        } else {
            throw new IllegalArgumentException("Invalid motivation");
        }
    }


}
