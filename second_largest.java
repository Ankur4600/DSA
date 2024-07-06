package DSA;
import java.util.*;
//program to find out second largest element in an array
public class second_largest {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the size of array ;");
        int size=obj.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<size; i++){
            array[i]=obj.nextInt();
        }
        int f_largest=array[0];
        int s_largest=array[0];
        //comparing the elements of array
        for(int i=1;i<size;i++){
            if(f_largest<array[i]){
                s_largest=f_largest;
                f_largest=array[i];
            }
            else{
                s_largest=array[i];
            }
        }
        System.out.println(" the second largest number is "+s_largest);
    } 
    
}
