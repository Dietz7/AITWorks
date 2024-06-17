package homework_35.dao;

import homework_35.model.Pet;

public class HotelImpl implements Hotel {

    private Pet[] pets;
    private int size;

    public HotelImpl(int capacity){
        pets = new Pet[capacity];
        size = 0;
    }

    @Override
    public boolean addPet(Pet pet) {
        if(pet == null || size == pets.length || findPet(pet.getId()) != null){
            return false;
        }
        pets[size++] = pet;
        return true;
    }

    @Override
    public Pet removePet(int id) {
        return null;
    }

    @Override
    public Pet findPet(int id) {
        return null;
    }

    @Override
    public Pet findPetByBreed() {
        return null;
    }

    @Override
    public double calculateTotalRevenue() {
        return 0;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printPet() {

    }
}
