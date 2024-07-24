package linkedlist;

public class oddEvenLL {
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
    Node addInList(Node head,int val){
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
    void printList(Node head){
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
    //function to combine first all odd index node together and then all even index node
    Node oddEven(Node head){
        //if the list is empty or has just unit node  then no need to do any operation on it
        if(head==null || head.next==null) return head;
        Node odd=head;
        Node even=head.next;
        Node evenHead=head.next;
        //seperating the list in two list one contain all odd  index node and other contain alleven index node
        while((even!=null && even.next!=null)){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        //combining both list
        odd.next=evenHead;
        return head;
    }
    public static void main(String[] args) {
        oddEvenLL list=new oddEvenLL();
        Node head=null;
        head=list.addInList(head, 1);
        head=list.addInList(head, 2);
        head=list.addInList(head, 3);
        head=list.addInList(head, 4);
        head=list.addInList(head, 5);
        // head=list.addInList(head, 6);
        list.printList(head);
        //calling the oddeven function
        head=list.oddEven(head);
        list.printList(head);
    }
}
