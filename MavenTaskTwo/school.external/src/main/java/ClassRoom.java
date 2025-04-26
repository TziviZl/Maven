import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String name;
    private List<Student> students;

    public ClassRoom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() { return name; }

    public List<Student> getStudents() { return students; }
    public  int getNumOfStudent(){
        return students.size();
    }
}
