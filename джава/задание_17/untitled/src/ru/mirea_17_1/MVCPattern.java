package ru.mirea_17_1;


public class MVCPattern {
    public static void main(String[] args) {

        // fetch student record based on his roll no from the database
        Student model = retriveStudentFromDatabase();

        // Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // update model data
        controller.setStudentName("Филя");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Мартин");
        student.setRollNo("23");
        return student;
    }
}