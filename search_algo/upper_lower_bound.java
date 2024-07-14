package search_algo;
//program to find upper and lower bound of an element in array
import java.util.Scanner;
public class upper_lower_bound {
    //method for upper bound
    static int upper_bound(int arr[],int x){
        int low=0;
        int high=arr.length -1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            } 
            else low=mid+1;
        }
        return ans;
    }
    //method for lower bound
    static int lower_bound(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low=high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size=sc.nextInt();
        int array[]=new int [size];
        System.out.println("Enter the element of array: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter the element to be search");
        int el=sc.nextInt();
        //calling lower bound
        int result=lower_bound(array,el);
        System.out.println("the bound is "+result);
       /* //calling upper bound
        int result2=upper_bound(array, el);
        System.out.println("The upper bound is "+result2);*/
    }
}
