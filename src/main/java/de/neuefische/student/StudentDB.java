package de.neuefische.student;

import java.util.HashMap;
import java.util.Map;

public class StudentDB {
    Map<String, Student> students = new HashMap<>();

    public StudentDB() {
    }

    public StudentDB(Student[] students) {
        for (Student student : students) {
            this.students.put(student.getId(), student);
        }
    }

    public Student[] getAllStudents() {
        return this.students.values().toArray(new Student[0]);
    }

    public Student getRandomStudent() {
        int index = (int) (Math.random() * this.students.size());
        return getAllStudents()[index];
    }

    public Student[] addStudent(Student newStudent) {
        this.students.put(newStudent.getId(), newStudent);
        return getAllStudents();
    }


    public Student[] removeStudent(Student studentToRemove) {
        if (isExist(studentToRemove)) {
            this.students.remove(studentToRemove.getId());
        }
        return getAllStudents();
    }

    public boolean isExist(Student studentToRemove) {
        return this.students.containsKey(studentToRemove.getId());
    }


    @Override
    public String toString() {
        return "StudentDB{" +
               "students=" + students +
               '}';
    }
}
