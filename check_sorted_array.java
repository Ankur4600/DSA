package DSA;
import java.util.*;
//program to check the array is sorted or not(increasing order)

public class check_sorted_array {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size= obj.nextInt();
        int array[]=new int [size];
        System.out.println("Enter the element of array");
        for(int i=0;i<size; i++){
            array[i]=obj.nextInt();
        }
        int start=array[0];
        for(int i=1;i<array.length;i++){
            if(start<=array[i]){
                start=array[i];
            }
            else{
                System.out.println("the array is not shorted");
                return;
            }
        }
    System.out.println("array is sorted");
    }
    
}
