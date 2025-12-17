package student;

public class mainApp {
    public static void main(String[] args) {
        Student s = new Student(101, "Amit", 85);
        student_util.calculatePercentage(s);
        student_util.isPassed(s);
        Box <Student> containBox = new Box<>();
        containBox.setValue(s);
        System.out.println("Box contains: " + containBox.getValue());
        DatabaseConnection.connect();    
    }
}
