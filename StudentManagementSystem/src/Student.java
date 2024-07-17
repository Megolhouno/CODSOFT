public class Student {
    private String name;
    private String studentId;
    private String phoneNumber;
    private String gender;
    private String email;

    public Student(String name, String studentId, String phoneNumber, String gender, String email) {
        this.name = name;
        this.studentId = studentId;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + ", Student ID: " + studentId + ", Phone Number: " + phoneNumber +
               ", Gender: " + gender + ", Email: " + email;
    }
}
