package homework_35;


import homework_35.dao.HotelImpl;
import homework_35.model.Cat;
import homework_35.model.Dog;
import homework_35.model.Pet;

public class HotelAppl {
    public static void main(String[] args) {
        HotelImpl hotel = new HotelImpl(5);// we have created object HOTEL based on the class CompanyImpl

        Pet[] pets = new Pet[4];
        pets[0] = new Cat(1, "Murka", "Persian", 5, 20, "white");
        pets[1] = new Cat(2, "Ljubka", "Siam", 3, 20, "grey");
        pets[2] = new Dog(3, "Balu", "Labrador", 5, 25, 25);
        pets[3] = new Dog(4, "Brave", "Schpitz", 2, 25, 5);

        for (Pet pet: pets) {
            hotel.addPet(pet);
        }

        // print all pets
        hotel.printPet();
        System.out.println("--------------------------------------------------");

        //find pet with ID = 4
        Pet pet = hotel.findPet(4);
        System.out.println(pet);
        //total revenue
        double totalRevenue = hotel.calculateTotalRevenue();
        System.out.println("Total revenue of hotel is: " + totalRevenue);

    }





}
