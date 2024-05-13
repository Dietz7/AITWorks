package homework_28.model;

public class Car {
    public String vendor;
    public int builtYear;

    public Car (String vendor, int builtYear){
        this.vendor = vendor;
        this.builtYear = builtYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", builtYear=" + builtYear +
                '}';
    }
}

