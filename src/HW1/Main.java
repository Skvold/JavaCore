package HW1;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human human = new Human(150, 8);
        Cat cat = new Cat(200, 15);
        Robot robot = new Robot(80, 5);
        Object[] participants = {human, cat, robot};

        RunTrack runTrack = new RunTrack();
        Wall wall = new Wall();
        List<Course> courses = new ArrayList<Course>() {{
            add(runTrack);
            add(wall);
        }};

        for (Course course : courses) {
            for (int i = 0; i < participants.length; i++) {
                if (participants[i] != null) {
                    boolean result = course.doIt(participants[i]);
                    if (!result) {
                        participants[i] = null;
                    }
                }
            }
        }
    }
}
