package StudentDatabaseManagementSystem;

import java.util.Locale;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses;
    private String studentId;
    private int tuitionBalance = 0;
    private static int courseCosts = 600;
    private static int id = 1000;

    //Constructor: ask user to enter firstName, lastName, & gradeYear

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter your grade year: ");
        this.gradeYear = scanner.nextInt();

        setStudentId();

        System.out.println(firstName + " " + lastName + ":" + " " + "year" + " " + gradeYear + " " + studentId);
    }

    //Generate a studentID
    private void setStudentId() {
        //Grade level + Id
        id++;
        this.studentId = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String selectedCourse = scanner.nextLine().toUpperCase();
            if (!selectedCourse.equals("Q")) {
                courses += "\n" + selectedCourse;
                tuitionBalance += courseCosts;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    //View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition() {
        System.out.println("Enter your payment amount: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of: $" + payment);
        if (tuitionBalance > 0) {
            System.out.println("Please enter payment amount: $");
        } else {
            System.out.println("Your tuition is fully paid!");
        }
        viewBalance();
    }

    //Show status
    public String showStatus() {
        return "Name: " + firstName + "" + lastName +
                "\nCourses Enrolled: " + courses +
                "\nTuition Balance: $" + tuitionBalance;

    }
}
