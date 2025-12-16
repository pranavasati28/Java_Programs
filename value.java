import java.util.Arrays;
import java.util.Scanner;
public class value {
    static int[] swap(int [] arr,int i, int j){
        int c;
        c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
        
        return arr;
    }






    static void strictlygreater(int[] arr,int a){   //method for printing strictly greater than values in an array
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                System.out.println(arr[i]+" ");
            }
        }
    }
    static int[] kthlargestSmallest(int[] arr,int k){
        Arrays.sort(arr);
        int[] arr_2={arr[k-1],arr[arr.length-k]};
        return arr_2;
    }
    static boolean isSoted(int [] arr)//check if array is sorted or nt
    {
        for(int i=0;i<arr.length && (i+1)<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    static int targetsum(int [] arr,int t){   //target sum 
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    cnt++;
                    break;
                }
                else if(arr[i]+arr[j]>t){
                    break;
                }
            }
        }
        return cnt;
    }

    static int uniquelement(int[] arr){
       Arrays.sort(arr);
       for(int i=0;i<arr.length && i+1<arr.length;i++){
        if(arr[i]==arr[i+1]){
            i++;
        }
        else{
            return arr[i];
        }
       }
       return arr[arr.length-1];
    }
    static int largest(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(mx<arr[i]){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int firstrepeatelement(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    

    static int[] reversearray(int[] arr){
        for(int i=0,j=arr.length-1;i<=j;i++,j--)
        {
            int c;
            c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
        }
        return arr;
    }
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
    static int[] rotation(int[] arr){
        for(int i=1;i<arr.length;i++){
            int c;
            c=arr[0];
            arr[0]=arr[i];
            arr[i]=c;
        }
        return arr;
    }
    static int[] krotation(int[] arr,int kt)
    {
        for(int i=0;i<kt;i++){
            rotation(arr);
        }
        return arr;
    }

    static int[] makefreqarray(int [] arr){  // method for making frequency array
        int[] freq=new int[100001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    static int[] sortzerone(int[] arr){
       int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==1){
                while(j>i){
                    if(arr[j]==0){
                        int c;
                        c=arr[i];
                        arr[i]=arr[j];
                        arr[j]=c;
                        j--;
                        break;
                    }
                    j--;

                }
            }
        }
        return arr;
    }

    static int [] lfevenodd(int [] arr){
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0 ){
                while(j>i){
                    if(arr[j] % 2 == 0){
                        swap(arr,i,j);
                        j--;
                        break;
                    }
                 j--;
                }
            }
        }
        return arr;
    }

    static int[] prefixsum(int[] arr,int t){
        
        
        for(int i=1;i<=t && i<arr.length;i++){
          arr[i]=arr[i]+arr[i-1];
         }
        return arr;
    }

    static int[] suffixsum(int[] arr){
        for(int i=arr.length-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];

        }
        
        return arr;
    }
    public static void Bubblesort(int [] arr){
        for(int i = arr.length - 1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        printArray(arr);
    }
    public static void insertion(int [][] arr){
        
    }
    
    public static int Binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + end / 2 ;
        
        while(arr[mid] != target){
            if(arr[mid] == target){
                return mid ;
            }
            else if (arr[mid]> target){
                end = mid - 1 ;
            }
            else if (arr[mid] <  target){
                start = mid + 1 ;
            }
            mid = start + end / 2 ;
        }
        return mid;

    }
    public static int recb(int[]  arr , int start , int end, int target ){
        int mid = start + end / 2 ;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            if(mid-1 >= 0 && arr[mid - 1] == target){
                while(mid -1 >=0 && arr[mid - 1 ] == target){
                    --mid;
                }
                return mid;
            }
            return mid;
        }
        else if (arr[mid] > target){
            return recb(arr, start, end-1, target);
        }
        else if (arr[mid] < target){
            return recb(arr, start+1, end, target);
        }
        return -1;
        
    }
    public static int sqrt(int n){
        int ans=1;
        int low = 1;
        int high = n;
        
        while(low <= high){
            int mid = low + (high-low) / 2 ;
            if((mid*mid) > n){
                high = mid - 1;
            }
            else if ((mid * mid) <= n){
                ans = mid;
                low = mid+1;
            }
        }
       return ans;
    }

    public static void printprime(int n){
        for(int i = 2; i <= n ; i++){
            boolean m = true;
            for(int j = 2 ; j <= sqrt(i) ; j++){
                if( i % j == 0){
                    m = false;
                    break;
                }
            }
            if(m){
                System.out.println(i);
            }
            
        }
    }
    public static void checkprime(int n){
        boolean m = true;
        for(int i = 2 ; i <= sqrt(n) ; i++){
            if (n % i == 0){
                m = false;
            }
        }
        if(m){
            System.out.println("its a prime ");
        }
        else{
            System.out.println("its nt a prime");
        }
    }
    public static void subarray(int[] arr){
        int maxsofar = arr[0];
        int current = arr[0];
        int temp = 0;
        int start = 0;
        int end = 0;
        for(int i = 1; i < arr.length ; i++){
            if( arr[i] > current + arr[i] ){
                current = arr[i];
                temp = i;
            }
            else {
                current += arr[i];
                
            }
            if(current > maxsofar){
                maxsofar = current;
                start = temp;
                end = i;
            }
        }
        int[] newarr = new int[end - start + 1];
        for(int i = 0 ; i < newarr.length ; i++){
            if(start <= end){
                newarr[i] = arr[start];
                start++;
            }
        }
        for(int i = 0 ; i < newarr.length ; i++){
            System.out.println(newarr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   

         System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        } 
        //strictlygreater(arr, 2);
        //System.out.println(isSoted(arr));
        
        
         

         /*      // main fn. for finding largest and smallest kth value in array
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
       int [] arr_2=kthlargestSmallest(arr, k);
       System.out.println("smmalest:"+" " + arr_2[0] + " " + "largest:" +" "+ arr_2[1]);*/

       /*int[] arr_copy =Arrays.copyOfRange(arr,0,3);
       System.out.println(arr_copy);*/ //coping array

        
       /*  System.out.println("enter the target sum value:");
        int t=sc.nextInt();
        System.out.println(targetsum(arr, t));*/

        //int[] uarr= new int[]{1,2,2,1,5,3,5};
        //System.out.println(uniquelement(uarr));

        //System.out.println("the largest number is:"+largest(arr));
       
      //  System.out.println("the first repeating element is:" + firstrepeatelement(arr));

      //System.out.print("the reversed array is:");
      //printArray(reversearray(arr));
  
   /*  System.out.print("Enter the k rotation value:"); 
    int kt=sc.nextInt();
     printArray(krotation(arr, kt));*/

     
     /*int[] freq=makefreqarray(arr);
     System.out.println("enter the number of query:");
     int q=sc.nextInt();
     System.out.println("enter the x element:");
     int x=sc.nextInt();
    while(q>0){
        if(freq[x]>0)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        q--;
    }*/
   // System.out.print("the sorted array:");
    //printArray(sortzerone(arr));

   // System.out.print("the evenodd array:");
   // printArray(lfevenodd(arr));
    

    /* System.out.println("enter the value of t:");
    int t=sc.nextInt();

    printArray(prefixsum(arr, t)); */

   /*  //printing sufix sum  
    printArray(suffixsum(arr)); */

    // printing bubble sort array
    //Bubblesort(arr);

    
    /*System.out.print("enter the target:- ");
    int target = sc.nextInt();
    int targetindexnumber =  recb(arr, 0, arr.length-1 , target);
    System.out.println("the first occurence is index: " + targetindexnumber); */
    

    // binary search recusively

    /*int n = sc.nextInt();
    int ans = sqrt(n);
    System.out.println(ans);*/

    //System.out.println("enter the number till u want to print prime numbers");
    //int n = sc.nextInt();
    //checkprime(n);
    
    subarray(arr);

 }

}

    

