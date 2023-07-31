package Seminar6.task1;


    // Без применения принципа SOLID
    class Animal {

        String name;

        Animal(String name) {
            this.name = name;
        }

        void eat() {
            System.out.println(name + " ест.");
        }

        void sleep() {
            System.out.println(name + " спит.");
        }

        void makeSound() {
            System.out.println(name + " издает звук.");
        }
    }

