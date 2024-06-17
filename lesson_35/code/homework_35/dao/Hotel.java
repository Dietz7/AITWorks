package homework_35.dao;

import homework_35.model.Pet;

public interface Hotel {
    boolean addPet(Pet pet);
    Pet removePet(int id);
    Pet findPet(int id);
    Pet findPetByBreed();
    double calculateTotalRevenue();
    int quantity();
    void printPet();


}
