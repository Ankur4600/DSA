package linkedlist;

public class detectLoopInList {
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
    //function to detect loop in the  list(tortoise and hare algo)
    boolean findLoop(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        detectLoopInList list= new detectLoopInList();
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
        tmp.next=head1;//looping the list
        //detecting the loop in the list
        boolean ans=list.findLoop(head);
        if(ans==true){
            System.out.print("Loop detected in the list");
        }
        else{
            System.out.println("No loop detected");
        }
    }
}


