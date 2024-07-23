package linkedlist;
//program to reverse the doubly linkedlist
public class reverseDll {
    //  int size;
     static Node head;
    // reverseDll(){
    //     size=0;
    // }
    class Node{
        int data;
        Node next;
        Node back;
        Node(int data,Node next,Node back){
            this.data=data;
            this.next=next;
            this.back=back;
        }
        Node(int data){
            this.data=data;
            this.next=null;
            this.back=null;
        }
       
    }
    Node addinList(Node head,int val){
        Node newNode=new Node(val,null,null);
        if(head==null){
            // size++;
          head=newNode;
          return head;
        }
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        // size++;
        tmp.next=newNode;
        newNode.back=tmp;
        return head;
    }
    void displayDll(Node head){
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
   //to reverse doubly linkedlist
    Node reverseLL(Node head){
        if(head==null||head.next==null) return head;
        Node tmp=head;
        Node prev=null;
        while(tmp!=null){
            prev=tmp.back;
            tmp.back=tmp.next;
            tmp.next=prev;
            tmp=tmp.back;

        }
        head=prev.back;
        return head;
    }
    public static void main(String[] args) {
        reverseDll list =new reverseDll();
        head=list.addinList(head, 9);
        head=list.addinList(head, 8);
        head=list.addinList(head, 8);
        head=list.addinList(head, 9);
        head=list.addinList(head, 1);
        head=list.addinList(head, 8);
        head=list.addinList(head, 7);
        head=list.addinList(head, 7);
        head=list.addinList(head, 2);
        head=list.addinList(head, 2);
        list.displayDll(head);
        //reversing doubly linkedlist 
        head=list.reverseLL(head);
        list.displayDll(head);

    }
}
