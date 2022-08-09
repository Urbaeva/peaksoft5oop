package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Burulai", 20, "female", 32, "pre-intermediate", "offline");
        Student student2 = new Student("Nurkyz", 19, "female", 34, "pre-intermediate", "offline");
        Student student3 = new Student("Kulen", 18, "male", 19, "elementary", "online");

        Student[] array = {student1, student2, student3};

        Course course = new Course("Programming", "Tom", "04.04.2020", array, 9, "Vostok 5", 20);
        System.out.printf("Course : %s, %s, %s, %s, %s\n",course.getCourseName(),course.getTeacherName(),course.getStartedAt(),course.getDuration(),course.getAddres());

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getPrintingSpeed() >= course.getPrintingSpeed()) {
                counter++;
                System.out.println(array[i].getName() + " " + array[i].getAge() + " " + array[i].getGender() + " " + array[i].getPrintingSpeed() + " " + array[i].getEnglishLevel() + " " + array[i].getFormatLearning());
            }
        }
        System.out.println(counter + " students passed");
    }
}
