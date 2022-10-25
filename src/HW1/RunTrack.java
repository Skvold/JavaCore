package HW1;

public class RunTrack extends Course {
    private final int length = 150;

    @Override
    public boolean doIt(Object participant) {
        CanRun canRun = (CanRun) participant;
        int participantMaxLength = canRun.run();
        if(participantMaxLength > length) {
            System.out.println(getClassName(participant) + " смог пробежать !");
            return true;
        } else {
            System.out.println(getClassName(participant) + " не смог пробежать !");
            return false;
        }
    }
}
