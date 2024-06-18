package homework_35.dao;

import homework_35.model.Pet;

public class HotelImpl implements Hotel {

    private Pet[] pets;
    private int size;

    public HotelImpl(int capacity) {
        pets = new Pet[capacity];
        size = 0;
    }

    @Override
    public boolean addPet(Pet pet) {
        if (pet == null || size == pets.length || findPet(pet.getId()) != null) {
            return false;
        }
        pets[size++] = pet;
        return true;
    }

    @Override
    public Pet removePet(int id) {
        for (int i = 0; i < size; i++) {
            if(pets[i].getId() == id){
                Pet victim = pets[i];
                pets [i] = pets[size--];
                pets[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Pet findPet(int id) {
        for (int i = 0; i <size; i++) {
            if(pets[i].getId() == id){
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public Pet findPetByBreed(String breed) {
        for (int i = 0; i < size; i++) {
            if(pets[i].getBreed().equals(breed)){
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (int i = 0; i < size; i++) {
            totalRevenue += pets[i].getTotalCost();
        }
        return totalRevenue;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printPet() {
        for (int i = 0; i < size; i++) {
            System.out.println(pets[i]);
        }

    }
}
