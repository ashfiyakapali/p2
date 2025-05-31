package p2_308;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    String dob;

    public Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayStudentDetails() {
        LocalDate birthDate = LocalDate.parse(dob);
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student("Ananya", "2005-08-15");
        s.displayStudentDetails();
    }
}
