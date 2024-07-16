package search_algo;
// program to find the peck element in the array(it can be 1 or more than 1 peck)
public class peak_element {
    static int search(int arr[]){
        int n=arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low=1,high=n-2,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]> arr[mid+1])
              return mid;
            else if(arr[mid]>arr[mid-1])
            low=mid+1;
            else if(arr[mid]>arr[mid+1])
             high=mid-1;
             //this condition is for multi[ple peck in the array
             else low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,5,1};//array having one peck element
        int ans1=search(array);
        System.out.println("the peak element at index "+ans1);
        //for multiple pecks
        System.out.println("for multiple pecks");
        int array1[]={1,2,1,3,4,5,6,4};//array having 2 peck element
        int ans2=search(array1);
        System.out.println("The peck element is at index "+ans2);
    }
}
