import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter Id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter email : ");
        String email = sc.nextLine();

        students.add(new Student(id,name,age,email));
    }


    public void readStudent() {
        if(students.isEmpty()){
            System.out.println("Student Directory Is Empty");
        }else {
            for(Student student : students) {
                System.out.println(student);
            }
        }
    }
}
