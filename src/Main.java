import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManagement system = new StudentManagement();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" ===========================================");
            System.out.println(" Welcome To Student Management System");
            System.out.println(" ===========================================");
            System.out.println("1. Add Student Data");
            System.out.println("2. See Student Data");
            System.out.println("3. Update Student Data");
            System.out.println("4. Delete Student Data");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    system.addStudent();
                    break;

                case 2:
                    system.readStudent();
                    break;
            }
        }



    }
}