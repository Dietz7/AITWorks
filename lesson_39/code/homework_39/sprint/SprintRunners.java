package homework_39.sprint;

import java.util.Objects;

public class SprintRunners implements Comparable <SprintRunners>{
    private String lastName;
    private String name;
    private int registrationNum;
    private String club;
    private double result;

    public SprintRunners(String lastName, String name, int registrationNum, String club, double result) {
        this.lastName = lastName;
        this.name = name;
        this.registrationNum = registrationNum;
        this.club = club;
        this.result = result;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(int registrationNum) {
        this.registrationNum = registrationNum;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "SprinterRunners{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", registrationNum=" + registrationNum +
                ", club='" + club + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SprintRunners that)) return false;
        return registrationNum == that.registrationNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNum);
    }

    @Override
    public int compareTo(SprintRunners o) {
        return Double.compare(this.result, o.result);
    }
}
