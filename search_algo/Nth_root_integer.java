package search_algo;
//program to find nth root of an interger
import java.util.Scanner;
public class Nth_root_integer {
    //fiundiing the  root
    static int fun1(int mid,int n,int num){
        long ans=1;
        for (int i=0;i<n;i++){
            ans=ans*mid;
            if(ans>num) return 1;
        }
        if(ans==num) return 2;
        return 0;
    }
    // finding the number for the nth root
    static int NthRoot(int num,int n){
        int low=1,high=num;
        while(low<=high){
           int mid=(low+high)/2;
            int new_mid=fun1(mid,n,num);
            if(new_mid==2) return mid;
            else if(new_mid==1) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numebr :");
        int number=sc.nextInt();
        System.out.print("Enter the nth root :");
        int n=sc.nextInt();
        int ans=NthRoot(number, n);
        if(ans==-1) System.out.println("The root not found...");
       else  System.out.println("The root is :"+ans);
    }
}
