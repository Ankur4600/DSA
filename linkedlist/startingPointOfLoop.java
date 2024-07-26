package linkedlist;
//program to find the first node of the loop in the list (leetcode problem)
public class startingPointOfLoop {
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
    //function to find the starting node of the loop  of the list
    Node startingPoint(Node head){
        Node fast=head;//first variable which move two step next
        Node slow=head;//second variable which move one step next
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        startingPointOfLoop list= new startingPointOfLoop();
        head=list.Addlist(head,5);
        head=list.Addlist(head, 10);
        head=list.Addlist(head, 15);
        head=list.Addlist(head, 20);
        head=list.Addlist(head, 25);
        head=list.Addlist(head, 30);
        head=list.Addlist(head, 35);
        head=list.Addlist(head, 40);
        head=list.Addlist(head, 45);
        head=list.Addlist(head, 50);
        head=list.Addlist(head, 55);
        //start the procedure to loop list
        Node head1=head.next.next.next.next;
        Node tmp=head1;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=head1;//looping the list;
        //function calling to find the starting node of the loop of the list
        Node start=list.startingPoint(head);
        if(start==null){
            System.out.println("there id no loop");
        }
        else{
            System.out.println("the first node of loop of the list is "+start.data);
        }
    }
}
