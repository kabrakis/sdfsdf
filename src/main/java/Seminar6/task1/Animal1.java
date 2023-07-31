package Seminar6.task1;

public class Animal1 {
    // С применением принципа SOLID
    class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }
    }

    class AnimalFeeding {
        void eat(Animal animal) {
            System.out.println(animal.name + " ест.");
        }
    }

    class AnimalSleeping {
        void sleep(Animal animal) {
            System.out.println(animal.name + " спит.");
        }
    }

    class AnimalSounds {
        void makeSound(Animal animal) {
            System.out.println(animal.name + " издает звук.");
        }
    }
}
