package linkedlist;
//program to find intersection point of two linkedlist(y linkedlist) leetcode question
public class intersectionPointSLL {
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
    Node insertNode(Node head,int val){
        Node newNode=new Node(val);
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
    void printList(Node head){
        if(head==null){
            System.out.println("the list is empty");
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
    //finding intersection point in y list
    Node intersectPoint( Node head1,Node head2){
        if(head1==null || head2==null) return null;
        Node tmp1=head1;
        Node tmp2=head2;
        while(tmp1!=tmp2){
            tmp1=tmp1.next;
            tmp2=tmp2.next;
            if(tmp1==tmp2)return tmp1;
            if(tmp1==null)tmp1=head2;
            if(tmp2==null)tmp2=head1;
        }
        return tmp1;
    }
    public static void main(String[] args) {
        intersectionPointSLL list= new intersectionPointSLL();  
        Node head = null;
        head=list.insertNode(head,1);
        head=list.insertNode(head,3);
        head=list.insertNode(head,1);
        head=list.insertNode(head,2);
        head=list.insertNode(head,4);
        //creating the intersected linked list
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = null;
        headSec=list.insertNode(headSec,3);
        Node head2 = headSec;
        headSec.next = head;
        //printing of the lists
        System.out.print("List1: "); list.printList(head1);
        System.out.print("List2: "); list.printList(head2);
        Node intersection=list.intersectPoint(head1,head2);
        if(intersection==null){
            System.out.println("no intersection point");
        }
       else{
        System.out.println("the intersection point is "+intersection.data);
       }
    }
}
