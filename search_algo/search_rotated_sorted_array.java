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
    public static void main(String[] args) {
        int array[]={7,8,9,1,2,3,4,5,6};
        int target=1;
        int ans=search(array,target); //calling the funtion
        if(ans==-1)System.out.print("The element is not present in the array");
       else System.out.print("The index number where element present is "+ans);
        
    }
}