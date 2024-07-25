package linkedlist;
//program to remove nth node from theend of the list
public class NthNodeFromEnd {
   static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
  static  Node addInList(Node head,int val){
        Node newNode= new Node(val);
        if(head==null){
            head=newNode;
            return head;
        }
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
        return head;
    }
   static void printList(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
        return;
    }
   /*function to delete nth noide from end keeping in mind that the n is not 
   greater the size of the list if it is program throw exception */
    static Node delNodeFromEnd(Node head,int n){
        Node first=head;
        Node second =new Node(-1);
        second.next=head;
        for(int i=0;i<n;i++){
            first=first.next;
        }
        //if n is equal to the size to list means we have to delete head node
        if(first==null){
            // head=head.next;
            return head.next;
        }
        while(first.next!=null){
            second=second.next;
            first=first.next;
        }
        second.next=second.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head= null;
       head =addInList(head,2);
       head =addInList(head,4);
       head =addInList(head,5);
       head =addInList(head,6);
       head =addInList(head,88);
       head =addInList(head,86);
       printList(head);
       delNodeFromEnd(head, 4);
       printList(head);
    }
    
}
