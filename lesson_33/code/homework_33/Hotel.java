package homework_33;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Pet> pets;

    public Hotel() {
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Pet pet : pets) {
            totalRevenue += pet.getTotalCost();
        }
        return totalRevenue;
    }

    public List<Pet> findPetsByBreed(String breed) {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet.getBreed().equalsIgnoreCase(breed)) {
                result.add(pet);
            }
        }
        return result;
    }

    public void printPets(List<Pet> pets) {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
