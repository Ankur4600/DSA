package search_algo;
//program to find element in rotated sorted array(leetcode)
public class search_rotated_sorted_array{
    static int search(int arr[],int target){
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            //finding which part of array is sorted
            if(arr[low]<=arr[mid]){//for left part of array
                if(arr[low]<=target && arr[mid]>=target) high=mid-1;
                else low=mid+1;
            }
            else{//for right part of array
                if(arr[mid]<=target && arr[high]>=target) low=mid+1;
                else high=mid-1;
                
            }
        }
        //in case when element not found in the array
        return -1;
    }
    /* searching for the element in rotated sorted when duplicates are present*/
    static boolean search_rotated_sorted_arrayII(int arr[],int target){
        int low=0, high=arr.length-1, mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target) return true;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=target && arr[mid]>=target) high=mid-1;
                else low=mid+1;
            }
            else{
                if(arr[mid]<=target && arr[high]>=target) low=mid+1;
                else high=mid-1;
            }

        }
       return false;
    }
    public static void main(String[] args) {
       /*  int array[]={7,8,9,1,2,3,4,5,6};
        int target=1;
        int ans=search(array,target); //calling the funtion
        if(ans==-1)System.out.print("The element is not present in the array");
       else System.out.print("The index number where element present is "+ans);
         */
       //array with duplicate element
       int arr[]={6,6,7,8,1,2,3,3,4,5,6};
       int target2=6;
       boolean ans2=search_rotated_sorted_arrayII(arr,target2);
       System.out.print(ans2);
        
    }
}