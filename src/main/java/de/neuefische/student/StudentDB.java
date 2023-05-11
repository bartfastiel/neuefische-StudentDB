package de.neuefische.student;

import java.util.Arrays;

public class StudentDB {
    Student[] students;

    public StudentDB(Student[] students){
        this.students = students;
    }

    public Student[] getAllStudents(){
        return this.students;
    }
    public Student getRandomStudent(){
     int index = (int)(Math.random() * this.students.length);
     return students[index];
    }

    public Student[] addStudent(Student newStudent){

        Student[] newStudentArr = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudentArr[i] = this.students[i];
        }
        newStudentArr[newStudentArr.length -1 ] = newStudent;
        this.students = newStudentArr;

        return students;
    }



    public Student[] removeStudent(Student studentToRemove){
        if(isExist(studentToRemove)){
            Student[] newStudentArr = new Student[students.length - 1];
            int index = 0;
            for (int i = 0; i < this.students.length; i++) {
                if(!this.students[i].equals(studentToRemove)){
                    newStudentArr[index++] = this.students[i];
                }
            }
            this.students = newStudentArr;
        }
        return students;
    }

    public boolean isExist(Student studentToRemove){
        boolean flag = false;
        for (int i = 0; i < this.students.length; i++) {
            if(this.students[i].equals(studentToRemove)){
                flag = true;
                break;
            }
        }
        return flag;
    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
