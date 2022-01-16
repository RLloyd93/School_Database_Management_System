package StudentDatabaseManagementSystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void enrollTest() {
        Student student = new Student();
        student.enroll();
    }

    @Test
    public void viewBalanceTest() {
        Student student = new Student();
        student.viewBalance();
    }

    @Test
    public void payTuitionTest() {
        Student student = new Student();
        student.payTuition();
    }

}