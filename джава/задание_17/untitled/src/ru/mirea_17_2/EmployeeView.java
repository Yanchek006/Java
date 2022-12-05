package ru.mirea_17_2;

public class EmployeeView {

    public void printEmployeeInformation(EmployeeModel emp){
        System.out.println("Employee [Salary="+emp.getSalary()+" /Name="+emp.getName()+" /Job="+emp.getJob()+"]");
    }
}