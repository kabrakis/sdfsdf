package Seminar7.task4;

public class Cat implements Animal {
    @Override
    public Animal clone() {
        return new Cat();
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

