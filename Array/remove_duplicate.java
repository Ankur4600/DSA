package Array;
// program to remove duplication in sorted array
import java.util.*;
public class remove_duplicate {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size =obj.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0; i<size;i++){
            array[i]=obj.nextInt();
        }
        int new_array[]=new int[size];
        // int tmp=array[0];
        int tmp=new_array[0];
        for(int i=1;i<size;i++){
            if(tmp!=array[i]&&tmp<array[i]){
                // tmp=array[i];
                new_array[i]=array[i];
                tmp=new_array[i];
            }
        }
        for(int i=0;i<new_array.length;i++){
        System.out.print(new_array[i]);
        };//printing last element of array
        // System.out.println("this is he new array");
        // for(int i=0; i<size; i++){
        //     System.out.print(new_array[i]);
        // }
        /*line no 14,16,21,25,26,27 are for exprimentto do somethng different */
    }
    
}
