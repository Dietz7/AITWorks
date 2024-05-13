package classwork_28.interfaces.figures;

public class Circle implements Drawable, Fillable {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }

    @Override
    public void fill() {
        System.out.println("Закрашиваем круг");
    }
}
