package student;

public final class student_util{
    public static void calculatePercentage(Student s){
        System.out.println(s.getMarks() + " %");
    }

    public static void isPassed(Student s){
        if(s.getMarks() >= 40 ){
            System.out.println("Result : pass");
        }
        else {
            System.out.println("Result : Fail");
        }
    }

    private student_util(){};
}


