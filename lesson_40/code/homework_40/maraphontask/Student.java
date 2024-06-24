package homework_40.maraphontask;

public class Student extends HighSchool {
   private String course;
    public Student(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + ", course='" + course + '\'';
    }
}
