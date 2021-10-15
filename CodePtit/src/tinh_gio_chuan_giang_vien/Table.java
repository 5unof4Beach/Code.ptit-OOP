package tinh_gio_chuan_giang_vien;

/**
 *
 * @author suckm
 */
public class Table {
    private String lecturerID,subjectID;
    private float hours;
    private Lecturer lecturer;
    private Subject subject;

    public Table(String lecturerID, String subjectID, float hours) {
        this.lecturerID = lecturerID;
        this.subjectID = subjectID;
        this.hours = hours;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String getLecturerID() {
        return lecturerID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public float getHours() {
        return hours;
    }
    
}
