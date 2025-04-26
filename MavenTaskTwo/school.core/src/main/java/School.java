import java.util.ArrayList;
import java.util.List;

public class School {
    private List<ClassRoom> classes;

    public School() {
        this.classes = new ArrayList<>();
    }

    public void addClass(ClassRoom classRoom) {
        classes.add(classRoom);
    }

    public List<ClassRoom> getClasses() {
        return classes;
    }

}
