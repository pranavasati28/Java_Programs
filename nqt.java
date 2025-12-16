import java.util.*;

public class nqt {
    public static void small(int [] arr){
        int max = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= max){
                max = arr[i];

            }
        }
        System.out.println("the smallest out of all thess is " + max);
    }
    
    static void bubblesort(int [] arr){
        int n = arr.length;
        while(n >= 0){

        for(int i = arr[0] ; i < n & i+1 < n; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        n--;
    }
    for(int i = 0 ; i < arr.length ; i++){
        System.out.println(arr[i]);
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            
        }
        bubblesort(arr);
        



    }
}
