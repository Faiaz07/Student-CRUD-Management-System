import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    {
        students.add(new Student(101,"Noman",26,"nomi@gmail.com"));
        students.add(new Student(102,"Tauhid",27,"tauhid@gmail.com"));
        students.add(new Student(103,"Mushfique",28,"mushu@gmail.com"));
        students.add(new Student(104,"Salekin",25,"saleka@gmail.com"));
    }
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
            System.out.println(" ===========================================");
            System.out.println("Student Data : ");
            for(Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void updateStudent(int id) {
        for(Student student:students){
            if(student.getId() == id) {
                System.out.println(" ===========================================");
                System.out.println("Student Id Found. What do you want to change?");
                System.out.println("1. ID");
                System.out.println("2. Name");
                System.out.println("3. Age");
                System.out.println("4. Email");
                System.out.println("5. Everything");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        System.out.println("Enter Id : ");
                        int newId = sc.nextInt();
                        sc.nextLine();

                        student.setId(newId);
                        break;

                    case 2:
                        System.out.println("Enter name : ");
                        String newName = sc.nextLine();

                        student.setName(newName);
                        break;

                    case 3:
                        System.out.println("Enter age : ");
                        int newAge = sc.nextInt();
                        sc.nextLine();

                        student.setAge(newAge);
                        break;
                    case 4:
                        System.out.println("Enter email : ");
                        String newEmail = sc.nextLine();

                        student.setMail(newEmail);
                        break;
                    case 5:
                        System.out.println("Enter Id : ");
                        newId = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter name : ");
                        newName = sc.nextLine();

                        System.out.println("Enter age : ");
                        newAge = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter email : ");
                        newEmail = sc.nextLine();

                        student.setId(newId);
                        student.setName(newName);
                        student.setAge(newAge);
                        student.setMail(newEmail);
                        break;

                    default:
                        System.out.println("Invalide choice. No changes made!!");
                        break;
                }



            }
        }
        System.out.println("Updated Successfully!!");
        System.out.println();
    }

    public void deleteStudent(int id) {
        for(Student student : students){
            if (student.getId() == id){
                students.remove(student);
                System.out.println("Student data removed successfully!!");
                return;
            }
        }
        System.out.println("Student not found");
    }
}
