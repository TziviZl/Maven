import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- תפריט ---");
            System.out.println("1. הוספת כיתה");
            System.out.println("2. הוספת תלמיד לכיתה");
            System.out.println("3. הצגת מבנה בית הספר");
            System.out.println("0. יציאה");
            System.out.print("בחר אפשרות: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("שם הכיתה: ");
                    String className = scanner.nextLine();
                    school.addClass(new ClassRoom(className));
                    break;
                case 2:
                    System.out.print("שם הכיתה להוסיף אליה תלמיד: ");
                    String classToAdd = scanner.nextLine();
                    ClassRoom found = school.getClasses().stream()
                            .filter(c -> c.getName().equals(classToAdd))
                            .findFirst()
                            .orElse(null);
                    if (found != null) {
                        System.out.print("שם התלמיד: ");
                        String studentName = scanner.nextLine();
                        System.out.print("ציון התלמיד: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        found.addStudent(new Student(studentName));
                    } else {
                        System.out.println("כיתה לא נמצאה.");
                    }
                    break;
                case 3:
                    System.out.println("------ מבנה בית הספר ------");
                    for (ClassRoom cr : school.getClasses()) {
                        System.out.println("כיתה: " + cr.getName());
                        for (Student s : cr.getStudents()) {
                            System.out.println("  - " + s);
                        }
                    }
                    break;
                case 0:
                    System.out.println("להתראות!");
                    return;
                default:
                    System.out.println("בחירה לא תקפה.");
            }
        }

    }

}
