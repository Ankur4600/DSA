package search_algo;
//program to find first and last occurance of an element in sorted array 
public class firstAndLast_occurance{
    //method for frst occurance
    static int first_occurance(int arr[],int target){
        int low=0,high=arr.length-1,first=-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=low-1;
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return first;
    }
    //method for last occurance
    static int last_occurance(int arr[],int target){
        int low=0,high=arr.length-1,mid=0,last=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return last;
    }
    //calling both function in one function
    static int [] call_fun(int arr[],int target){
        int ans[]=new int[2];
        int first=first_occurance(arr,target);
        ans[0]=first;
        int last=last_occurance(arr, target);
        ans[1]=last;
        return ans;
    }
    public static void main(String[] args) {
        int array[]={2,4,6,8,8,8,11,13};
        int x=11;
        int ans[]=call_fun(array,x);
        //displaying both indexes
        System.out.print("[ ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.print("]");
        
    }
}