package com.company;
import java.util.*;

class Classroom {
    int capacity;
    ArrayList<Student> students ;
    ArrayList<Teacher> teachers;

    public Classroom (int capacity) {
        this.capacity=capacity;
        this.students=new ArrayList<Student>();
        this.teachers=new ArrayList<Teacher>();
    }

    public void add_student (Student info){
        if (this.students.size()< this.capacity) {
            this.students.add(info);
        }else{
            System.out.println("Warning: Reached Max Capacity!");
        }

    }

    public int number_students (){
        return this.students.size();
    }

    public ArrayList<Student> find_males(){
        ArrayList<Student> males = new ArrayList<Student>();
        for (Student std: this.students){
            if (std.sex.equals("male")){
                males.add(std);
            }
        }
        return males;
    }

    public ArrayList<Student> find_females(){
        ArrayList<Student> females = new ArrayList<Student>();
        for (Student std: this.students){
            if (std.sex.equals("female")){
                females.add(std);
            }
        }
        return females;
    }

    public ArrayList<Student> top_n_students(Integer n){
        ArrayList<Student> top_n = new ArrayList<Student>();
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.attendence.compareTo(s1.attendence);
            }
        });
        for (Student std: this.students) {
            if (top_n.size() < n) {
                top_n.add(std);
            }
        }
        return top_n;
    }

    public void add_teacher (Teacher info){
        this.teachers.add(info);
    }

    public int number_teachers (){
        return this.teachers.size();
    }
}
