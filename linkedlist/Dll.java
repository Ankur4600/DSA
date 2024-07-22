package linkedlist;

public class Dll {
    class Node{
        int data;//data which is stored in the node
        Node next;//reference to the next node
        Node back;//reference to the previous node
        //constructor with both data and reference to next and previous node
        Node(int data,Node next,Node back){
            this.data=data;
            this.next=next;
            this.back=back;
        }
        //constructor with data and both reference pointing to the null
        Node(int data){
            this.data=data;
            this.next=null;
            this.back=null;
        }

    }
    // coverting array to list
    Node convertArraytoList(int arr[]){
        Node head= new Node(arr[0]);//creating head node
        Node prev=head;
        //converting the array into the list
        for(int i=1;i<arr.length;i++){
            Node tmp=new Node(arr[i],null,prev);
            prev.next=tmp;
            prev=tmp;
        }
        return head;
    }
    //function to print list
    void displaylist(Node head){
        if (head==null){
            System.out.println("the list is empty");
        }
        Node tmp=head;
        // System.out.print("null<-");
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            // System.out.print("<->");
            tmp=tmp.next;
        }
        System.out.println();
        // System.out.println("->null");

    }
  // function to insert node at tail
    Node insertAtTail(Node head,int val){
        Node newNode=new Node(val);//creating new node
        //edge case
        if(head==null){
            head=newNode;
            return head;
        }
        //adding node at the tail of the list
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
        newNode.back=tmp;
        return head;
    }
   // insert at the head of the list
    Node insertAtHead(Node head,int val){
        Node newNode=new Node(val);//creating new Node
        if (head==null){
            head=newNode;
            return head;
        }
        //adding node before head
        head.back=newNode;
        newNode.next=head;
        head=newNode;
        return head;
    }
    //insert before the given position
    Node insertAtn(Node head,int n,int val){
        //if the n is equals to  1 then call insert at head
        if(n==1){
            return insertAtHead(head, val);
        }
        Node tmp=head;
        int flag=-1;
        int count=0;
        //inserting at nth node
        while(tmp!=null){
            count++;
            if(count==n){
                flag=1;
                Node prev=tmp.back;
                Node newNode= new Node(val,tmp,prev);
                prev.next=newNode;
                tmp.back=newNode;
                return head;
            }
            tmp=tmp.next;
        }
        //if the position is 1 greater than the list
        if(flag==-1){
            return insertAtTail(head,val);
        }
        return head;
    }
    //function to insert before the given node
    Node insertAtNode(Node head, int node, int val){
        if(head.data==node){
            return insertAtHead(head, val);
        }
        Node tmp=head;
        int flag=-1;
        while(tmp!=null){
            if(tmp.data==node){
                flag=1;
               Node pre=tmp.back;
               Node newNode=new Node(val,tmp,pre);
               pre.next=newNode;
               tmp.back=newNode;
               return head;
            }
            tmp=tmp.next;
        }
        if (flag==-1){
            System.out.println("node not found");
        }
       
        return head;
    }
    public static void main(String[] args) {
        Dll list=new Dll();
        int array[]={1,2,3,4,5,6,7,8,9};
        //coverting array to list
        Node head=list.convertArraytoList(array);
        list.displaylist(head);
       // adding  node at the tail to the list
       head=list.insertAtTail(head,35);
       list.displaylist(head);
       //inserting node before head to the list
        head=list.insertAtHead(head,55);
        list.displaylist(head);
        //inserting at the nth position
        head=list.insertAtn(head,12,99);
        list.displaylist(head);
        //inserting before the given node
        head=list.insertAtNode(head,8,18);
        list.displaylist(head);
    }

}
