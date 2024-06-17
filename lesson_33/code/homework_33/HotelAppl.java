package homework_33;

import java.util.List;

public class HotelAppl {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.addPet(new Cat("Whiskers", "Siamese", 5, 15.0));
        hotel.addPet(new Dog("Rex", "Labrador", 7, 20.0));
        hotel.addPet(new Cat("Shadow", "Persian", 3, 10.0));
        hotel.addPet(new Dog("Buddy", "Golden Retriever", 4, 25.0));

        System.out.println("Total hotel revenue: $" + hotel.calculateTotalRevenue());

        String breedToFind = "Labrador";
        List<Pet> foundPets = hotel.findPetsByBreed(breedToFind);
        System.out.println("Pets of breed '" + breedToFind + "':");
        hotel.printPets(foundPets);
    }
    }

