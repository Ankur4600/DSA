package search_algo;
/*this problem is from leetcode we need to find single element in the array
     where rest of the element are repeating their selfs */
public class single_element_Inarray {
    static int search(int array[]){
        int n=array.length;
        if(n==1) return array[0];//if the array has singkle element
        if(array[0]!=array[1]) return array[0];//if the first element is single element
        if(array[n-1]!= array[n-2]) return array[n-1];//if the last element is single element
        int low=1,high=n-2,mid=0;
        //checking for single element in the array by binary search
        while(low<=high){
            mid=(low+high)/2;
            if(array[mid]!=array[mid-1] && array[mid]!=array[mid+1])
             return array[mid];
            if((mid%2==0 && array[mid]==array[mid+1])||(mid%2==1 && array[mid]==array[mid-1]))
                low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5,6,6,7,7,8,8};
        int ans=search(arr);//calling the function
        System.out.println("The single element in the array is "+ans);
    }
    
}
