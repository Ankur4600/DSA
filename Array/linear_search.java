package Array;
//linear search
import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size=sc.nextInt();
        int array[]= new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be search");
        int num=sc.nextInt();//taking number to be search
        for(int i=0; i<size; i++){//searching the number
            if(array[i]==num){
                System.out.print("the number found at index "+i);
            }
        }
    }
    
}
