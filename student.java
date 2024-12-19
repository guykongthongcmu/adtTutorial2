public class student {
    private String SID;
    private String firstname;
    private String lastName;

    public student(String studentID, String studentFN, String studentLN) {
        SID = studentID;
        firstname = studentFN;
        lastName = studentLN;
    }

    public String getFirstName() {
        return firstname;
    }

    public String toString() {
        return SID + " " + firstname + " " + lastName;
    }
}
