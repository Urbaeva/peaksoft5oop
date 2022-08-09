package com.company;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int printingSpeed;
    private String englishLevel;
    private String formatLearning;

    public Student(String name, int age, String gender, int printingSpeed, String englishLevel, String formatLearning){
        if (name.length() > 2)
            this.name = name;
        else
            System.out.println(" Аты 2 тамгадан узун болушу керек");

        if (gender.equals("female") || gender.equals("male"))
            this.gender = gender;
        else
            System.out.println("Gender is not true");

        if (age > 0)
            this.age = age;
        else
            System.out.println("Студенттин жашы терс болбошу керек");

        this.printingSpeed = printingSpeed;
        this.englishLevel = englishLevel;
        this.formatLearning = formatLearning;
    }

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPrintingSpeed(int printingSpeed) {
        this.printingSpeed = printingSpeed;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public void setFormatLearning(String formatLearning) {
        this.formatLearning = formatLearning;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getPrintingSpeed() {
        return printingSpeed;
    }

    public String getFormatLearning() {
        return formatLearning;
    }
}
