package Array;
public class twoSum{
    
    static int[] Sum(int arr[],int n){
        int ans[]={};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println(i+" "+j);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[]={0,-1,2,-3,1};
        int sum=-2;
        Sum(arr1,sum);
    }
}
