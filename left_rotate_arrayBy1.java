package DSA;
import java.util.Scanner;
//program to left rotate an array by one place
public class left_rotate_arrayBy1 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=obj.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0; i<size; i++){
            array[i]=obj.nextInt();
        }
        int temp=array[0];
        //loop for rotating the array
        for (int i=1; i<array.length; i++){
            array[i-1]=array[i];
        }
        array[size-1]=temp;
        //printing new array
        System.out.print("The new array is:");
        for(int i=0;i<size;i++){
            System.out.print(array[i]);
        }
        
    }
}
