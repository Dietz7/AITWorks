package homework_39.maraphon_task.model;

public class MeatFood extends Product{
    private String meatType;

    public MeatFood(double price, String name, long barCode, String meatType) {
        super(price, name, barCode);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                '}';
    }
}

