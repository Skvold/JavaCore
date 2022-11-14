package HW6;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Шустрик");
        Dog dog = new Dog("Полкан");

        cat.swim(50);
        dog.swim(5);
        cat.run(300);
        cat.run(150);
        dog.run(1000);
        dog.run(400);

        Cat secondCat = new Cat("Муська");
        secondCat.run(30);

        System.out.println("Мы создали " + Animal.animalCount + " животных!");
    }
}
