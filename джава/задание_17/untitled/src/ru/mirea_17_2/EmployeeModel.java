package ru.mirea_17_2;

public class EmployeeModel {

    private int salary;
    private String name;
    private String job;

    public EmployeeModel(int salary, String name, String job) {
        super();
        this.salary = salary;
        this.name = name;
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }


}