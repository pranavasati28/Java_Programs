package student;

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
