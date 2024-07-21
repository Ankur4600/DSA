package linkedlist;
public class deleteAtPosition {
    Node head;
    static int size=0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //function to delete the nobde at the given position
    public void deletePos(int pos){
        if(pos>size || pos<0){
            System.out.println("position should not be more than size and also cannot be negative");
            return;
        }
        if(head==null){
            System.out.println(" List is empty");
            return;
        }
        if(pos==1){
            head=head.next;
            return;
        }
        int count=0;
        Node tmp=head;
        while(tmp!=null){
            count++;
            if(count==pos-1){
                tmp.next=tmp.next.next;
                printList();
                return;
            }
            tmp=tmp.next;
        }
        
    }

    // function to delete element which is provided by the user
    public void deleteElement(int element){
        int flag=-1;
        if(head==null) {
            System.out.println("The list is empty");
        }
        if(head.data==element){
            head=head.next;
            return;
        }
        Node tmp=head;
        Node prev=null;
        while(tmp!=null){
            if(tmp.data==element){
                prev.next=tmp.next;
                printList();
                flag=1;
                return;
            }
            prev=tmp;
            tmp=tmp.next;
        }
        if(flag==-1){
            System.out.println("element not found");
            return;
        }
    }
    //adding element to the list
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
     }
     public void printList(){
        if(head==null) {
            System.out.println("The list is empty");
        }
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"->");
            tmp=tmp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        insertAtPosition list=new insertAtPosition();
        deleteAtPosition list1=new deleteAtPosition();
        list1.addLast(56);
        list1.addLast(57);
        list1.addLast(58);
        list1.addLast(59);
        list1.printList();
        list1.deletePos(-1);//deteting the element from the position
        list1.deleteElement(99);//deleting the node of given value
        
    }
    
}
