package main.java.com.testapp.afor.pattern;

public class AnimalHouse {

    public static void main (String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("Dog");

        animal1.live();

        Animal animal2 = animalFactory.getAnimal("COW");

        animal2.live();

        Animal animal3 = animalFactory.getAnimal("mOUSE");

        animal3.live();
    }
}
