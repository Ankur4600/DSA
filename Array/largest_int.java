package Array;

import java.util.Scanner;
//program to find largest element of an array
public class largest_int {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size; i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        //checking for laargest number
        for(int i=1;i<size;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("the largest number is "+largest);
    }
}
