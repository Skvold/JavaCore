package HW3;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //#1
        String[] array = new String[]{
                "First", "Second", "Third"
        };
        changeArrayElements(array, 1, 2);
        System.out.println(Arrays.toString(array));

        //#2

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Box <Apple> appleBox = new Box<>();

        appleBox.add(apple1);
        appleBox.add(apple2);
        appleBox.add(apple3);
        appleBox.add(apple4);

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box <Orange> orangeBox = new Box<>();

        orangeBox.add(orange1);
        orangeBox.add(orange2);
        orangeBox.add(orange3);

        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("========================");

        System.out.println("Результат сравнения веса коробок: " + appleBox.compare(orangeBox));

        Box<Apple> appleBoxShifted = new Box<>();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        appleBoxShifted.add(apple5);
        appleBoxShifted.add(apple6);

        System.out.println("========================");
        System.out.println("Вес новой коробки с яблоками: " + appleBoxShifted.getWeight());

        appleBox.shift(appleBoxShifted);

        System.out.println("========================");
        System.out.println("Вес первой коробки после перекладывания: " + appleBox.getWeight());
        System.out.println("Вес новой коробки после перекладывания: " + appleBoxShifted.getWeight());
    }

    //№1
    public static void changeArrayElements(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
//
}
