package HW1;

public class Wall extends Course {

    private final int height = 9;

    @Override
    public boolean doIt(Object participant) {
        CanJump canJump = (CanJump) participant;
        int participantMaxHeight = canJump.jump();
        if(participantMaxHeight > height) {
            System.out.println(getClassName(participant) + " смог перепрыгнуть !");
            return true;
        } else {
            System.out.println(getClassName(participant) + " не смог перепрыгнуть !");
            return false;
        }
    }
}
