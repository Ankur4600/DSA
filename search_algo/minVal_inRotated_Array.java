package search_algo;
import java.util.*;
//program to find the minimum value in th rotated sorted array
public class minVal_inRotated_Array {
    static int min_val(int arr[]){
        int mid=0,high=arr.length-1, low=0;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            mid=(low+high)/2;
            /*if(arr[low]<=arr[high]){
                if(ans>arr[low]) ans=arr[low];
                break;
            }*/
            /*eliminating the sorted area by assigning minimum value of that
             part of array to variable ans if ans is greater than that.*/
             //checking if the left part is sorted
            if(arr[low]<=arr[mid]){
               if(arr[low]<ans) ans=arr[low];//assign lower value to ans variable
                low=mid+1;//eliminate the left part of the array
            }
            //if right part is sorted
            else{
               if(arr[mid]<ans) ans=arr[mid];//assign the minimum value to ans variable
                high=mid-1; //eliminate the right part of the array
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,-44,1,2,3};
        int Ans=min_val(arr);//calling the fumction
        System.out.println(Ans);
    }
    
}
