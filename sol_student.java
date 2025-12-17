public class Student {
    private int RollNo;
    private String Name;
    private int Marks;

    public Student(int RollNo, String Name, int Marks){
        this.RollNo = RollNo;
        this.Name = Name;
        this.Marks = Marks;
    }

    public int getRollno(){
        return RollNo;
    }

    public String getName(){
        return Name;
    }

    public int getMarks(){
        return Marks;
    } 

}

public final class StudentUtil{
    public static void calculatePercentage(Student s){
        System.out.println(s.getMarks() / 100 * 100 + "%");s.getMarks() / 100 * 100;
    }

    public static void isPassed(Student s){
        if(s.getMarks() >= 40 ){
            System.out.println("Result : pass");
        }
        else {
            System.out.println("Result : Fail");
        }
    }

    private StudentUtil(){

    }
}

class Box<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}

class DatabaseConnection{ // singletonClass

    private static DatabaseConnection instance = null;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(instance == null) instance = new DatabaseConnection();
        return instance;
    }

    public static void connect(){
        System.out.println("Connected to database");
    }
}

public class sol_student{
    public static void main(String[] args) {
        Student s = new Student(101, "Amit", 85);
        
        System.out.println("Student :RollNo = " + s.getRollno() + "Name = " + s.getName() + "MArks= " + s.getMarks() );
        
        StudentUtil.calculatePercentage(s);
        StudentUtil.isPassed(s);

        Box<Student> = new Box();

        DatabaseConnection.connect();



    }
}

