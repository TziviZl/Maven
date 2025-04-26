import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Services services= new Services();
        List<ClassRoom> classRooms= services.createClassRooms();
        System.out.println(services.calculateAverageGrade(classRooms));

    }
}
