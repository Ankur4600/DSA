package DSA;

import java.util.Scanner;
//program to move all the "0" to the end index of array
public class zeros_to_end {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter the element of array");
        for(int i=0;i<size; i++){
            array[i]=sc.nextInt();
        }
        int a=-1;
        //checking for the position of zero in array
        for (int i=0;i<size;i++){
            if(array[i]==0){
                a=i;
                break;
            } 
        }
        if(a==-1){
            System.out.println("array don't have any zero");
            return;
        }
        for(int i=a+1;i<size;i++){
            if(array[i]!=0){
                int tmp=array[i];
                array[i]=array[a];
                array[a]=tmp;
                a++;
            }
            System.out.print(array[i]);
        }
        for(int i=0; i<size; i++){
            System.out.print(array[i]);
        }
    }
}/*took help of internetin this problem as my own 
     program was too lenthy */
