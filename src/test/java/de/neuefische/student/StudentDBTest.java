package de.neuefische.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentDBTest {

    @Test
    void getAllStudents_returnAllStudents() {
        //GIVEN
        Student jan = new Student("1","Jan");
        Student tommy = new Student("2","Tommy");
        Student topi = new Student("3","Topi");
        Student[] students = {jan,topi,tommy};

        StudentDB studentDB = new StudentDB(students);

        //WHEN
        Student[] actual = studentDB.getAllStudents();

        //THEN
        Assertions.assertArrayEquals(students,actual);
    }

    @Test
    void testToString() {
        //GIVEN
        Student jan = new Student("1","Jan");
        Student tommy = new Student("2","Tommy");
        Student topi = new Student("3","Topi");
        Student[] students = {jan,topi,tommy};

        String expected = "StudentDB{students=[Student{id='1', name='Jan'}, Student{id='3', name='Topi'}, Student{id='2', name='Tommy'}]}";
        StudentDB studentDB = new StudentDB(students);
        //WHEN
        String actual = studentDB.toString();

        //Then
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void addStudent_thenReturnTheStudentPlusOneMore(){
        //GIVEN
        Student jan = new Student("1","Jan");
        Student topi = new Student("3","Topi");
        Student tommy = new Student("2","Tommy");
        Student[] students = {jan,topi};

        Student[] expected = {jan,topi,tommy};

        StudentDB studentDB = new StudentDB(students);

        //WHEN
        Student[] actual = studentDB.addStudent(tommy);

        //THEN
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void removeStudent_WhenDeleteStudentReturnStudentsMinusOne(){
        //GIVEN
        Student jan = new Student("1","Jan");
        Student topi = new Student("3","Topi");
        Student tommy = new Student("2","Tommy");
        Student[] students = {jan,topi,tommy};

        Student[] expected = {jan,topi};

        StudentDB studentDB = new StudentDB(students);
        System.out.println(studentDB);

        //WHEN
        Student[] actual = studentDB.removeStudent(tommy);

        System.out.println(studentDB);
        //THEN
        Assertions.assertArrayEquals(expected,actual);
    }
}