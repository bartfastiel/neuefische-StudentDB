package de.neuefische.student;

import org.assertj.core.api.Assertions;
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
        Assertions.assertThat(actual).containsExactlyInAnyOrder(students);
    }

    @Test
    void testToString() {
        //GIVEN
        Student jan = new Student("1","Jan");
        Student tommy = new Student("2","Tommy");
        Student topi = new Student("3","Topi");
        Student[] students = {jan,topi,tommy};

        String expected = "StudentDB{students={1=Student{id='1', name='Jan'}, 2=Student{id='2', name='Tommy'}, 3=Student{id='3', name='Topi'}}}";
        StudentDB studentDB = new StudentDB(students);
        //WHEN
        String actual = studentDB.toString();

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);

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
        Assertions.assertThat(actual).contains(expected);
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
        Assertions.assertThat(actual).containsExactly(expected);
    }
}