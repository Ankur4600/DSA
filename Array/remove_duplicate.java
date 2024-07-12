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
        // int new_array[]=new int[size];
        int tmp=array[0];
        // new_array[0]=tmp;
        for(int i=1;i<size;i++){
            if(tmp!=array[i]&&tmp<array[i]){
                System.out.print(tmp);// printing the element of array
                tmp=array[i];
                // new_array[i]=tmp;
            }
        }
        System.out.println(tmp);//printing last element of array
        // System.out.println("this is he new array");
        // for(int i=0; i<size; i++){
        //     System.out.print(new_array[i]);
        // }
        /*line no 14,16,21,25,26,27 are for exprimentto do somethng different */
    }
    
}
