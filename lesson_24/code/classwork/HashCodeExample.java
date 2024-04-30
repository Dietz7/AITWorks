package classwork;

import java.util.Objects;

class User {
    String name;
    int age;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        User user1 = new User ("Karl", 100);
        User user2 = new User ("Karl", 100);
        User user3 = new User ("Karl", 100);

        System.out.println("user1 == user2 " + user1.equals(user2));
        System.out.println("user1 == user3 " + user1.equals(user3));

        System.out.println();

        System.out.println(" hash(" + user1 + ")= " + user1.hashCode());
        System.out.println(" hash(" + user2 + ")= " + user2.hashCode());
    }
}
