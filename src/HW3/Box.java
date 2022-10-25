package HW3;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private final List<T> list = new ArrayList<>();

    //добавить
    public void add(T element) {
        list.add(element);
    }

    //посчитать вес
    public float getWeight() {
        float sum = 0;
        for (T element : list) {
            sum += element.getWeight();
        }
        return sum;
    }

    //сравнить
    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    //переложить
    public void shift(Box<T> box) {
        box.list.addAll(list);
        list.clear();
    }
}
