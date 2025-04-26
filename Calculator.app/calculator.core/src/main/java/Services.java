import java.util.ArrayList;
import java.util.List;

public class Services {

    public double calculateAverageGrade(List<ClassRoom> classrooms) {
        double total = 0.0;
        int count = 0;
        for (ClassRoom classroom : classrooms) {
            total+=classroom.getNumOfStudent();
            count++;
        }
        return total / count ;
    }

    public List<ClassRoom> createClassRooms(){
        ClassRoom classRoom=new ClassRoom("A");
        ClassRoom classRoom2=new ClassRoom("B");
        ClassRoom classRoom3=new ClassRoom("C");

        Student student1=new Student("chani");
        Student student2=new Student("chaya");
        Student student3=new Student("tzivi");
        Student student4=new Student("miryami");
        Student student5=new Student("odelya");

        classRoom.addStudent(student1);
        classRoom.addStudent(student2);

        classRoom2.addStudent(student3);

        classRoom3.addStudent(student4);
        classRoom3.addStudent(student5);

        List<ClassRoom> classRooms = new ArrayList<>();
        classRooms.add(classRoom);
        classRooms.add(classRoom2);
        classRooms.add(classRoom3);
        return classRooms;
    }

}
