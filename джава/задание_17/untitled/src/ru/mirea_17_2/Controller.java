package ru.mirea_17_2;


public class Controller {

    private EmployeeModel employeeModel;
    private EmployeeView employeeView;

    public Controller(EmployeeModel employeeModel, EmployeeView employeeView) {
        super();
        this.employeeModel = employeeModel;
        this.employeeView = employeeView;
    }

    public void setEmployeeSalary (int salary) {
        employeeModel.setSalary(salary);
        updateView();
    }

    public int getEmployeeSalary () {
        return employeeModel.getSalary();
    }

    public void setEmployeeName (String name) {
        employeeModel.setName(name);
        updateView();
    }

    public String getEmployeeName () {
        return employeeModel.getName();
    }

    public void setEmployeeJob (String job) {
        employeeModel.setJob(job);
        updateView();
    }

    public String getEmployeeJob() {
        return employeeModel.getJob();
    }

    public void updateView(){
        employeeView.printEmployeeInformation(employeeModel);
    }


}
