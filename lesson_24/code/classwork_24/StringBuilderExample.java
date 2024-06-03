package classwork;

import java.util.Objects;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Создаем объект StringBuilder
        StringBuilder shoppingList = new StringBuilder();

        // Добавляем пункты в список покупок
        shoppingList.append("Молоко");
        shoppingList.append(", Яйца");
        shoppingList.append(", Хлеб");
        shoppingList.append(", Шоколад");

        // Выведем итоговый список покупок
        System.out.println(
                "Список покупок: " + shoppingList.toString()
        );
    }
    }


class StringExample {
    public static void main(String[] args) {
// create empty Line
        String shoppingList = "";

        shoppingList = shoppingList + "Milk";
        shoppingList = shoppingList + " Eggs";
        shoppingList = shoppingList + " Bread";
        shoppingList = shoppingList + " Chokolate";

        System.out.println("List of the " + shoppingList);

    }
}

class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("a");
        str.append(" cat");
        str.insert(0, "I have ");
        str.delete(7, 9);
        int i = str.indexOf("cat");
        str.delete(i, i+3);
        int haveIndex = str.indexOf("have");
        str.replace(haveIndex, haveIndex + 4, "had");

        str.append("headache"); // " I had headache

        System.out.println(str.toString());
    }
}
