package homework_35.tests;

import homework_35.dao.Hotel;
import homework_35.dao.HotelImpl;
import homework_35.model.Cat;
import homework_35.model.Dog;
import homework_35.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelImplTest {
    Hotel hotel;
    Pet[] pets;

    @BeforeEach
    void setUp() {
        hotel = new HotelImpl(5);
        pets = new Pet[4];
        pets[0] = new Cat(1, "Murka", "Persian", 5, 20, "white");
        pets[1] = new Cat(2, "Ljubka", "Siam", 3, 20, "grey");
        pets[2] = new Dog(3, "Balu", "Labrador", 5, 25, 25);
        pets[3] = new Dog(4, "Brave", "Schpitz", 2, 25, 5);

        for (Pet pet: pets) {
            hotel.addPet(pet);
        }

    }

    @Test
    void addPet () {
        // it is not allowed to add null
        assertFalse(hotel.addPet(null));
        // it is not allowed to add an existed pet second time
        assertFalse(hotel.addPet(pets[1]));
        assertFalse(hotel.addPet(pets[1]));
        //now we are adding an employee
        Pet pet = new Dog(5, "Jack", "Labrador", 7, 25, 25);
        assertTrue(hotel.addPet(pet));
        // check quantity after adding the new employee
        assertEquals(5, hotel.quantity());
        // not allowed to exceed capacity of the company
        Pet petOneMore = new Cat(7, "Leon", "Persian", 3, 20, "brown");
        assertFalse(hotel.addPet(petOneMore));
        hotel.printPet();
    }

    @Test
    void removePet() {
        assertEquals(pets[2], hotel.removePet(3));
        assertEquals(3, hotel.quantity());
    }

    @Test
    void findPet() {
        // find pet with id = 4;
        assertEquals(pets[3], hotel.findPet(4));
        // find nonexistent pet with id = 11
        assertNull(hotel.findPet(11));
    }

    @Test
    void findPetByBreed() {
        assertEquals(pets[3], hotel.findPetByBreed("Schpitz"));
        assertNull(hotel.findPetByBreed("nonexistent")); // search of the nonexistent author
    }

    @Test
    void calculateTotalRevenue() {
        double totalRevenue = hotel.calculateTotalRevenue();
        assertEquals(335, totalRevenue);

    }

    @Test
    void quantity() {
        assertEquals(4, hotel.quantity());
    }

    @Test
    void printPet() {
        hotel.printPet();
    }
}