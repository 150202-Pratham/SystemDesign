package LibraryManagementSystem;

import java.util.UUID;

public class Student {

    private UUID studentId ;
    private String studentName ;

    public Student(UUID studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
