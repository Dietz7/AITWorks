package homework_45;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private int course;
    private int numGroup;
    private String country;
    private String gender;

    public Student(int id, String firstName, String lastName, LocalDate birthday, int course, int numGroup, String country,
                   String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.course = course;
        this.numGroup = numGroup;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthDay;
    }

    public int getCourse() {
        return course;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }
    public int getAge() {
        return Period.between(birthDay, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", course=" + course +
                ", numGroup=" + numGroup +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
