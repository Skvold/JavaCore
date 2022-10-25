package HW1;

public class Human implements CanRun, CanJump {
//человек
    private int maxLength;
    private int maxHeight;

    public Human(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public int run () {
        System.out.println("Человек бежит");
        return maxLength;
    }

    @Override
    public int jump () {
        System.out.println("Человек прыгает");
        return maxHeight;
    }
}
