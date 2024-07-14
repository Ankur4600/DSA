package search_algo;
//orogram  for search insert position problem of leetcode
public class search_insert_position {
    static int search_insert(int arr[],int num){
        int ans=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==num){
                ans=i;
             return ans;
            }
             if(arr[i]>num){
                ans=i;
                return ans;
            } 
        }
        if(arr[arr.length-1]<num){
            ans=arr.length;
            return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int num=9;
        int index=search_insert(arr, num);
        System.out.println("the index is :"+index);
    }
}
