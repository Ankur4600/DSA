package linkedlist;
//program to insert node at given position
import java.util.Scanner;
public class insertAtPosition {
    Node head;
    int count=0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //for inserting at given position
    public void insertPos(int data,int pos){
        Node newNode= new Node(data);
        count++;
        //checking for edge cases
        if(head==null){
            if(pos==1){
                head=newNode;
                return;
            }
            else{
                System.out.println("Invalide poisition");
                return;
            }
        }
        // checking for edge cases
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        int count=0;
        Node tmp=head;
        //inserting the node at the given position
        while(tmp!=null){
            count++;
            if(count==pos-1){
                newNode.next=tmp.next;
                tmp.next=newNode;
                return;
            }
            tmp=tmp.next;
        }
        return;

    }
    //for printing list
    public void printList(){
        if(head==null) {
            System.out.println("The list is empty");
        }
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"->");
            tmp=tmp.next;
        }
        System.out.println("null");

    }


    //for inserting before an element
    public void insertVal(int data,int val){
        Node newNode=new Node(data);
        int flag=-1;
        if(head==null){
            head=newNode;
            return;
        }
        Node tmp=head;
        while(tmp.next!=null){
            if(tmp.next.data==val){
                flag=1;
                newNode.next=tmp.next;
                tmp.next=newNode;
                printList();
                return;
            }
            tmp=tmp.next;
        }
        // Incase if the value before element to be insert is not found in list
        if(flag==-1){
            System.out.println("Element not found");
            return;
        }

    }
    public static void main(String[] args) {
        insertAtPosition list=new insertAtPosition();
        //inserting the elemnet at the position normally
        list.insertPos(56,1);
        list.insertPos(57,2);
        list.insertPos(58,3);
        list.insertPos(59,4);
        list.printList();//printing the list
        // Scanner sc= new Scanner(System.in);
        // //asking to user to enter the element and position where the node to be inserted
        // System.out.print("Enter the element to be inserted: ");
        // int element=sc.nextInt();
        // System.out.print("Enter the position where to insert :");
        // int pos=sc.nextInt();
        // if(pos<=list.count+1 && pos>=1){
        // list.insertPos(element,pos);
        // //printing the list
        // list.printList();
        // }
        // else System.out.println("invalid position");
        list.insertVal(55,59);//inserting the element befor given value
       

    }
}
