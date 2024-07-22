package linkedlist;
public class deleteInDll {
    private int size;
    deleteInDll(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node back;
        Node(int data1,Node next1,Node back1){
            this.data=data1;
            this.next=next1;
            this.back=back1;
        }
        Node(int data1){
            this.data=data1;
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
            size++;
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
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
    }
    //deleting node from the head of the linkedlist
    Node deleteAtHead(Node head){
        //checking for edge case
        if(head==null|| head.next==null){
            size--;
            return null;
        }
        //deleting node from head
        size--;
        head=head.next;
        head.back=null;
        return head;
    }
    //deleting node  from tail of the linkedlist
    Node deleteAtTail(Node head){
        //checking for the base case
        if(head==null||head.next==null) return null;
        Node tmp=head;
        //deleting from the tail of the list
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        Node prev=tmp.back;
        prev.next=null;
        tmp.back=null;
        return head;
    }
    //deleting the node from nth position
    Node deleteAtN(Node head,int n){
        //checking if the position is greater the size
        if(n>size){
            System.out.println("position should not be greater the the size of the list ");
            return head;
        }
        //if the list is empty or has only node
        if(head==null||head.next==null) {
            size--;
            return null;
        }
        //if the value of n is 1
        if(n==1){
            size--;
            return deleteAtHead(head);
        }
        Node tmp=head;
        int count=0;
        int flag=-1;
        //deleting the nth node from the list
        while(tmp.next!=null){
            count++;
            if(count==n){
                flag=1;
                size--;
                Node prev=tmp.back;
                Node front=tmp.next;
                tmp.next=tmp.back=null;
                prev.next=front;
                front.back=prev;
                return head;
            }
            tmp=tmp.next;
        }
        //if the position is greater than the list it simply delete the last node
        if(flag==-1){
            size--;
            return deleteAtTail(head);
        }
        return head;
    }
   // deleteing the given node
    Node deleteNode(Node head,int val){
        if(head==null|| head.next==null) {
            size--;
            return null;
        }
        //if the given node is head of the list
        if(head.data==val){
            size--;
            head=head.next;
            head.back=null;
            return head;
        }
        Node tmp=head;
        int flag=-1;
        //deleting the node if it present just before the last node
        while(tmp.next!=null){
            if(tmp.data==val){
                size--;
                flag=1;
                Node prev=tmp.back;
                Node front=tmp.next;
                tmp.next=tmp.back=null;
                prev.next=front;
                front.back=prev;
                return head;
            }
            tmp=tmp.next;
        }
       //if the given node is at the tail of the list
        if(tmp.data==val){
            size--;
            flag=1;
            return deleteAtTail(head);
        }
        //if the node not found in the list
        if(flag==-1){
            System.out.println("node not found");
            return head;
        }

    return head;
   }
    public static void main(String[] args) {
        deleteInDll list=new deleteInDll();
        int array[]={1,2,3,4,5,6,7,8,9};
        //coverting array to list
        Node head=list.convertArraytoList(array);
        list.displaylist(head);
        //deleting node from head
        head=list.deleteAtHead( head);
        list.displaylist(head);
        //deleting node for the tail of the list
        head=list.deleteAtTail(head);
        list.displaylist(head);
        //deleting from nth position
        head=list.deleteAtN( head,1);
        list.displaylist(head);
        //deleting the given node
        head=list.deleteNode(head ,8);
        list.displaylist(head);
    }

}
