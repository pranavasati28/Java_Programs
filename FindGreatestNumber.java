package java programs;
import java.util.Scanner;
public class FindGreatestNumber {
    
    public static void FindGreatestNumber(int ...var){
        int ans = 0;
        for(int test : var ){
            if(ans < test){
                ans = test;
            }
        }
        
        System.out.println("the greatest is " + ans);
        
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
         
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        
        FindGreatestNumber(a,b,c);
    }
}
