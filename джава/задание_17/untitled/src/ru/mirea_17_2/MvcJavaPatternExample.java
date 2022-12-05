package ru.mirea_17_2;


public class MvcJavaPatternExample {

    public static void main(String[] args) {

        EmployeeModel employeeModel = new EmployeeModel(90000, "Маликов Михаил", "Analyst");
        EmployeeView employeeView = new EmployeeView();

        Controller controller = new Controller(employeeModel, employeeView);

        controller.updateView();

        controller.setEmployeeJob("Programmer");
        controller.setEmployeeJob("Lawyer");
        controller.setEmployeeJob("Pilot");
        controller.setEmployeeName("Юршакеев Юлиан");
        controller.setEmployeeName("Дамберландский Дарьян");
        controller.setEmployeeSalary(368000);
        controller.setEmployeeSalary(78000);

    }
}