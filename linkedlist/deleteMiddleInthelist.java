package linkedlist;

public class deleteMiddleInthelist {
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
    Node deleteMid(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node fast=head;//first variable which move two step next
        Node slow=head;//second variable which move one step next
        /*in this problem we have to delete the middle node of the list so it is important to
         * reach one node before the middle node for the we move fast two step ahead of slow
         * just i did below
         */
        fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //now after the loop get terminated the slow variable reaches one node befor middle node 
        //all we need to do is just free the node
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        deleteMiddleInthelist list= new deleteMiddleInthelist();
        head=list.Addlist(head,5);
        head=list.Addlist(head, 10);
        head=list.Addlist(head, 15);
        head=list.Addlist(head, 20);
        head=list.Addlist(head, 25);
        head=list.Addlist(head, 30);
        list.printlist(head);
        //function calling to find the middle of the list
        Node mid=list.deleteMid(head);
        list.printlist(mid);
    }
}
