package Array;
import java.util.*;

//program to find which element comes more than n/2 in the array
public class majority_element {
    //normal solution for this problem
    static void normal_sol(int arr[]){
        int l=arr.length;
        for(int i=0; i<l;i++){
            int count=0;
            for(int j=0; j<l; j++){
                if(arr[j]==arr[i]){ 
                    count++;
                }
               
            }
            if(count>(l/2)){
                System.out.println("The majority element is: "+arr[i]);
                return;
            }
        }
    }
    //another solution by using hashing
    static void hashing_sol(int arr[]){
        int l=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<l;i++){
            int val=map.getOrDefault(arr[i],0 );
            map.put(arr[i], val+1);
        }
        for(Map.Entry<Integer,Integer>it : map.entrySet()){
            if(it.getValue()>(l/2)){
                System.out.println("The majority element is :"+it.getKey());
                return;
            }

        }
        System.out.println("there is no majority element");
        return;

    }
    //moore's vooting algorithm for this problem
    static void moores_voting_algo(int arr[]){
        int element=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                element=arr[i];
                count++;
            }
            else if(element==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]) count1++;
        }
        if(count1>(arr.length/2)){
            System.out.println("The majority element is :"+ element);
            return;
        }
        System.out.println("There is no majority element");
        return;
    }
    public static void main(String[] args) {
        int arr[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
      
        // normal_sol(arr);     //calling normal solution
        // hashing_sol(arr);    //calling hashing function(Note for me:have to learn hashing one more time to clear doubt )
        moores_voting_algo(arr); //calling moore's voting alorithm
    }
    
}
