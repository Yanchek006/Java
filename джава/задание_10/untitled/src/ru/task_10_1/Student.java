package ru.task_10_1;

class Student {

    private int course;
    private String name;

    private String surname;
    private String specialization;
    private int group;

    public Student(int course, String name, String surname, String specialization, int group) {
        this.course = course;
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getGroup() {
        return group;
    }
}


