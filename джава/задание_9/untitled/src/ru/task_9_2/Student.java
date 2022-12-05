package ru.task_9_2;

class Student {

    private int result;
    private String name;


    public Student(int result, String name) {
        this.result = result;
        this.name = name;
    }

    public int getCourse() {
        return result;
    }

    public String getName() {
        return name;
    }

}

