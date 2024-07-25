package linkedlist;
//program to find the middle of the linkedlist (leetcode problem)
public class midOfTheList {
    static Node head;
    class Node{
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
    Node Addlist(Node head,int val){
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
    void printlist(Node head){
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
    //function to find the middle node of the list
    Node midnode(Node head){
        Node fast=head;//first variable which move two step next
        Node slow=head;//second variable which move one step next
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //at the end of the while loop when fast traverse full list slow is pointing at the middle of the list
        return slow;
    }
    public static void main(String[] args) {
        midOfTheList list= new midOfTheList();
        head=list.Addlist(head,5);
        head=list.Addlist(head, 10);
        head=list.Addlist(head, 15);
        head=list.Addlist(head, 20);
        head=list.Addlist(head, 25);
        head=list.Addlist(head, 30);
        list.printlist(head);
        //function calling to find the middle of the list
        Node mid=list.midnode(head);
        list.printlist(mid);
    }
}
