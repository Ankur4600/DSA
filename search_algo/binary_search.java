package search_algo;
//program for binary search
//this  searching algo only work on sorted area
public class binary_search {
    //binary search without using recusive functino
    static int search(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid =(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    //by recursion
    static int recursive(int arr[],int low,int high,int target){
        if(low>high) return -1;
        int mid =(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]<target) 
         return recursive(arr,mid+1,high,target);
        return recursive(arr,low,mid-1,target);
    }
    static int search1(int arr[],int search){
        return recursive(arr,0,arr.length-1,search);
    }
    public static void main(String[] args) {
        int array[]={3,4,6,9,12,16,17};
        int target=4;
        int target1=4;
        int result=search(array,target1);//function calling
        if(result==-1) System.out.println("The target is not present in the array");
        else System.out.println("The target is found at "+(result+1)+" position");
        //calling recursive function
        int ans=search1(array,target);
        if(ans==-1)
            System.out.println("The target is not present in the array");
        else
        System.out.println("The target is found at "+ans+"position");
    }
    
}
