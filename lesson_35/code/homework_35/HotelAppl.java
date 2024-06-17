package homework_35;


import homework_35.dao.HotelImpl;
import homework_35.model.Cat;
import homework_35.model.Dog;
import homework_35.model.Pet;

public class HotelAppl {
    public static void main(String[] args) {
        HotelImpl hotel = new HotelImpl(5);// we have created object HOTEL based on the class CompanyImpl

        Pet[] ho = new Pet[4];
        ho[0] = new Cat(1, "Murka", "Persian", 5, 20, "white");
        ho[1] = new Cat(2, "Ljubka", "Siam", 3, 20, "grey");
        ho[2] = new Dog(3, "Balu", "Labrador", 5, 25, 25);
        ho[3] = new Dog(4, "Brave", "Schpitz", 2, 25, 5);

        for (Pet p: ho) {
            hotel.addPet(p);
        }

        // print all pets
        hotel.printPet();
        System.out.println("--------------------------------------------------");
    }



}
