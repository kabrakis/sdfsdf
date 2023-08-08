package Seminar7.task4;

public class Dog implements Animal {
    @Override
    public Animal clone() {
        return new Dog();
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
