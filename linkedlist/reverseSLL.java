package linkedlist;

public class reverseSLL {
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
    //reversing the singlylist by iterative method 
    Node reverseSLL(Node head){
        if(head==null || head.next==null) return head;
        Node tmp=head;
        Node prev=null;
        while(tmp!=null){
            Node front= tmp.next;
            tmp.next=prev;
            prev=tmp;
            tmp=front;
        }
        head=prev;
        return head;
    }
    //reversing the list by recursive function
    Node recuReverseLL(Node head){
        if(head==null || head.next==null) return head;
        //recursively calling the function till the base case 
        Node newHead= recuReverseLL(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        reverseSLL list= new reverseSLL();
        head=list.Addlist(head,5);
        head=list.Addlist(head, 10);
        head=list.Addlist(head, 15);
        head=list.Addlist(head, 20);
        head=list.Addlist(head, 25);
        head=list.Addlist(head, 30);
        list.printlist(head);
        //reversing the list by iterative method
        /* 
          head=list.reverseSLL(head);
          list.printlist(head);
        */
        //reversing the list by recursion function
        head=list.recuReverseLL(head);
        list.printlist(head);
    }
}
