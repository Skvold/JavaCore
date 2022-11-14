package HW6;

public class Animal {

    public static int animalCount = 0;

    private final String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int length) {
        System.out.println(name + " пробежал " + length + "м.");
    }

    public void swim(int length) {
        System.out.println(name + " проплыл " + length + "м.");
    }
}
