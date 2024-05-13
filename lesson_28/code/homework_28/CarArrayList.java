package homework_28;

import homework_28.model.Car;

import java.util.Arrays;

public class CarArrayList implements ArrayList{
    private static final int INIT_ARRAY_SIZE = 5;
    private Car[] data;
    private int count;

    public CarArrayList(){
        // inizialisation of the first
        this.data = new Car[INIT_ARRAY_SIZE];
        this.count = 0;
    }
    public void add(Car value) {  // добавление нового элемента
        int index = this.count;
        if (index >= this.data.length) {
            increaseArray();
            //  если свободных мест в this.data больше нет - расщиряем массив
        }
        this.data[index] = value;
        this.count ++;
    }

    private void increaseArray() {
        // расширение массива

        // увеличиваем размер в 1.5 раза
        double sizeOfNewArray = this.data.length*1.5;
        Car [] newArray = new Car[(int) sizeOfNewArray];

        // копируем значения из старого массива в новый
        for (int i = 0; i < this.data.length; i++) {
            newArray[i] = this.data[i];
        }
        this.data = newArray;
    }
    public Car get(int index) {
        if (index >= this.count) {
            // тригерим ошибку если пытаются получить элемент выходящий за рамки известного количества элементов списка
            return this.data[-1];
        }
        // to do
        return this.data [index];
    }

    public Car remove (int index) {
        Car value = this.get(index);

        for (int i = index + 1; i < this.count; i++){
            // смещаем элементы стоящие справа от удаляемого на одну позицию влево
            this.data[i - 1] = this.data[i];
        }

        this.count-=1;
        // to do
        return value;
    }

    public int getCount () {
        return count;
    }

    @Override
    public String toString(){
        return "IntArrayList{data = " + Arrays.toString(this.data) + ", count=" + this.count + "}";

        
    }
}
