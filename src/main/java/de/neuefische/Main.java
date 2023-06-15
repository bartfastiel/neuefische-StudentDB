package de.neuefische;

import de.neuefische.student.Student;
import de.neuefische.student.StudentDB;

public class Main {
    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB();
        studentDB.addStudent(new Student("1", "Hans"));
        studentDB.addStudent(new Student("2", "Peter"));
        System.out.println(studentDB);

        Student randomStudent = studentDB.getRandomStudent();
        System.out.println("random: " + randomStudent);
    }
}
