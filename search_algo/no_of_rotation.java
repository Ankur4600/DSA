package search_algo;
//program to find how many time the array has been rotated
//in this problem the index of minimum value is the number of rotation 
//so we just have to check for the index of min value
public class no_of_rotation {
    static int NoofRotation(int arr[]){
        int low=0,high=arr.length-1,mid=0;
        int min=Integer.MAX_VALUE;
        int index=-1;
        while(low<high){
            mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                min=arr[low];
                index=low;
                break;
            }
            if(arr[low]<=arr[mid]){
               if(arr[low]<min){
                   min=arr[low];
                   index=low;
               }
               low=mid+1;
            }
            else{
                if(arr[mid]<min){
                    min=arr[mid];
                    index=mid;
                }
                high=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int array[]={3,4,5,1,2};
        int ans=NoofRotation(array);
        System.out.println("The array is rotated by "+ans+" times");
    }
}
