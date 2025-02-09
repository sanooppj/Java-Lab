import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String address;
    private String gender;

    public Person(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
    }

    public void displayPersonDetails() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
    }
}

class Employee extends Person {
    private int empId;
    private String companyName;
    private String qualification;
    private double salary;

    public Employee(Scanner sc) {
        super(sc);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();

        System.out.print("Enter Qualification: ");
        qualification = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
    }
}

class Teacher extends Employee {
    private int teacherId;
    private String subject;
    private String department;

    public Teacher(Scanner sc) {
        super(sc);

        System.out.print("Enter Teacher ID: ");
        teacherId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Subject: ");
        subject = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    public void displayTeacherDetails() {
        displayEmployeeDetails();
        System.out.println("\nTeacher Details:");
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class MultiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int numTeachers = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[numTeachers];

        for (int i = 0; i < numTeachers; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
            teachers[i] = new Teacher(sc);
        }

        System.out.println("\nDisplaying Teacher Details:");
        for (int i = 0; i < numTeachers; i++) {
            System.out.println("\nTeacher " + (i + 1) + " Details:");
            teachers[i].displayTeacherDetails();
        }

        sc.close();
    }
}
