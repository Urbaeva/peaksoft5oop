package com.company;

public class Course {
    private String courseName;
    private String teacherName;
    private String startedAt;
    private Student[] students;
    private int duration;
    private String addres;
    private int printingSpeed;


    public Course(String courseName, String teacherName, String startedAt, Student[] students, int duration, String addres, int printingSpeed){
        this.courseName = courseName;
        this.startedAt = startedAt;
        if (teacherName.length() > 2)
            this.teacherName = teacherName;
        else
            System.out.println("Аты 2 тамгадан узун болушу керек");

        this.students = students;
        this.duration = duration;
        this.addres = addres;
        this.printingSpeed = printingSpeed;
//        int counter = 0;
//        if (Student.getPrintingSpeed() >= 20) {
//            this.printingSpeed = printingSpeed;
//            counter++;
//        }
//
//        Student[] students1 = new Student[counter];
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setPrintingSpeed(int printingSpeed) {
        this.printingSpeed = printingSpeed;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getPrintingSpeed() {
        return printingSpeed;
    }

    public String getAddres() {
        return addres;
    }

    public int getDuration() {
        return duration;
    }
}
