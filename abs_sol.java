public class abs_sol {
    public static void main(String[] args) {
        circle cirobj = new circle(3);
        rectangle recobj = new rectangle(10, 20);
        
        cirobj.displayType();
        
        double circlearea = cirobj.area();
        System.out.println("the area of circle will be :" + circlearea);
        
        recobj.displayType();
        
        double rectanglearea = recobj.area();
        System.out.println("the rectangle area is " + rectanglearea);
    }
}
abstract class Shape{
    public abstract double area(); 

    void displayType(){

    }
}

class circle extends Shape{

    int radius;

    circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14 * this.radius * this.radius;
        
    } 

    @Override
    void displayType(){
        System.out.println("this is a circle");
    }
}

class rectangle extends Shape{
    int length;
    int width;

    rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return this.length * this.width;
    }

    @Override
    void displayType(){
        System.out.println("this is a rectangle");
    }
}