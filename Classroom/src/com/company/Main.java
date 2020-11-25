package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Classroom classroom1= new Classroom(5);
	    Student student1= new Student("Cc", "Liu", "female",20);
        Student student2= new Student("Qi", "Liu", "male",25);
        Student student3= new Student("Qi", "Lu", "male",21);
        Student student4= new Student("Q", "Lu", "male",30);

        Teacher teacher1= new Teacher("Bob", "Lee", "male", "CS");
        classroom1.add_student(student1);
        classroom1.add_student(student2);
        classroom1.add_student(student3);
        classroom1.add_student(student4);
        classroom1.add_teacher(teacher1);

        ArrayList<Student> topstudents=classroom1.top_n_students(3);
        for (Student std: topstudents){
            System.out.println(std.attendence);
        }

        System.out.println(classroom1.number_students());

        ArrayList<Student> males=classroom1.find_males();
        for (Student std: males){
            System.out.println(std.lastname);
            System.out.println(std.firstname);
        }

        System.out.println(classroom1.number_teachers());

    }
}
