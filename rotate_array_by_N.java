package DSA;
import java.util.Scanner;
// program to left rotate element array by n place
public class rotate_array_by_N {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=obj.nextInt();
        int array[]=new int[size];
        System.out.println("enter the element of array");
        for(int i=0; i<size; i++){
            array[i]=obj.nextInt();
        }
        System.out.println("enter number of place to be rotate");
        int r_size=obj.nextInt();
        /* learning from my mistake as i just notice i don't have to write different code  for "r_size<size"
         * and "r_size>size" all i need to do is find the "r_size % size" it will work same
         */
        // if(size>r_size){
        //     int tmp[]=new int[r_size];
        //     for(int i=0; i<r_size; i++){
        //         tmp[i]=array[i];//copy first "r_size" elements in tmp array
        //     }
        //     System.out.print("The new array is ");//printing the rotated array
        //     for(int i=r_size; i<size; i++){
        //         array[i-r_size]=array[i];
        //         System.out.print(array[i]);
        //     }
        //     for (int i=size-r_size;i<size;i++){
        //         array[i]=tmp[i-((size)-r_size)];
        //         System.out.print(array[i]);
        //     }
        
        // }
        // //if place of rotation is greater the size of array
        // else{
            r_size= r_size%size;
            int tmp[]=new int[r_size];
            for(int i=0; i<r_size; i++){
                tmp[i]=array[i];//copy first "r_size" elements in tmp array
            }
            System.out.print("The new array is ");//printing the rotated array
            for(int i=r_size; i<size; i++){
                array[i-r_size]=array[i];
                System.out.print(array[i]);
            }
            for (int i=size-r_size;i<size;i++){
                array[i]=tmp[i-((size)-r_size)];
                System.out.print(array[i]);
            }
        // }
    }
}
