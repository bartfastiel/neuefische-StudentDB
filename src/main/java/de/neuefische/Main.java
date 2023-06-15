package de.neuefische;

import de.neuefische.student.Student;
import de.neuefische.student.StudentDB;
import de.neuefische.student.StudentNotFoundException;

public class Main {
    public static void main(String[] args) throws StudentNotFoundException {
        StudentDB studentDB = new StudentDB();
        studentDB.addStudent(new Student("1", "Hans"));
        studentDB.addStudent(new Student("2", "Peter"));
        System.out.println(studentDB);

        Student randomStudent = studentDB.getRandomStudent();
        System.out.println("random: " + randomStudent);

        Student pickedStudent = studentDB.findById("3");
        System.out.println("picked: " + pickedStudent);
    }
}
