package com.company;

class People {
    public String firstname;
    public String lastname;
    public String sex;

    public People (String firstname, String lastname, String sex){
        this.firstname=firstname;
        this.lastname=lastname;
        this.sex=sex;
    }
}

class Student extends People {
    public Integer attendence;

    public Student (String firstname, String lastname, String sex,Integer attendence){
        super(firstname, lastname, sex);
        this.attendence=attendence;
    }
}

class Teacher extends People {
    public String subject;

    public Teacher (String firstname, String lastname, String sex, String subject){
        super(firstname, lastname, sex);
        this.subject = subject;
    }

}
