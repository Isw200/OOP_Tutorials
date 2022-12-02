package JTable;

import java.util.Date;

public class Student extends Person{
    private String stdId;
    private String course;

    public Student(String name, Date dob, String stdId, String course) {
        super(name, dob);
        this.stdId = stdId;
        this.course = course;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
