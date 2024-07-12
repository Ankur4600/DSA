package Array;
//program to sort an array whict contain only 0's,1's and2's

public class array_sort {
    static void Sort(int arr[]){
        int l=arr.length;
        int low=0,mid=0,high=l-1;
        System.out.print("The sorted array is :");
        //sorting array in ascending order
        for(int i=0;i<l;i++){
            if(arr[mid]==0){
                int tmp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=tmp;
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else if(arr[mid]==2){
                int tmp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=tmp;
                high--;
            }
        }
        //printing array after sorting
        System.out.print("The sorted array is :");
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={0,1,1,0,1,2,1,2,0,0,0};
        Sort(a);//calling the function
    }
}
