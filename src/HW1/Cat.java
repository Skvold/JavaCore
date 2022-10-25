package HW1;

public class Cat implements CanRun, CanJump {
//коте
    private int maxLength;
    private int maxHeight;

    public Cat(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public int run () {
        System.out.println("Кот бежит");
        return maxLength;
    }
    @Override
    public int jump () {
        System.out.println("Кот прыгает");
        return maxHeight;
    }

}
