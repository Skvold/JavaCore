package HW2;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[4][];
        String[] first = new String[]{"2", "2", "3", "86"};
        String[] second = new String[]{"15", "2", "4", "2"};
        String[] third = new String[]{"13", "2", "3", "12"};
        String[] fourth = new String[]{"7", "5", "43", "6"};
        array[0] = first;
        array[1] = second;
        array[2] = third;
        array[3] = fourth;

        ArrayHandler handler = new ArrayHandler();

        try {
            int result = handler.handle(array);
            System.out.println(result);
        } catch (RuntimeException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }
        System.out.println("Конец программы");
    }
}
