package linkedlist;
//learning about linkedlist
public class linkedList {
    Node head;//creating head of the linkedlist
    int size;//for size of the list
    linkedList(){
        this.size=0;
    }
    //in java we represent node in the form of class
    class Node{
        String data;//
        Node next;
        //creating the constructor for assigning the value of data and the value of next
        Node(String data){
            this.data=data;//assign value of data
            this.next=null;//initially next of every node have null value
            size++;
        }
    }
 //function for adding the node at first place
 public void addFirst(String data){
    //creating new node
    Node newNode=new Node(data);
    size++;//counter for nodes
    //checking for edge codition
    if(head==null){
        head=newNode;
        return;
    } 
    newNode.next=head;
    head=newNode;
 }
 //function to  add node at last
 public void addLast(String data){
    //creating new node
    Node newNode=new Node(data);
    size++;//counter for the nodes
    if(head==null){
        head=newNode;
        return;
    }
    Node temp=head;//creating a temp variable to itrate to the end of the list
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;//adding the node at last of the list
 }
 // function to print the list
 public void printList(){
    if(head==null){
        System.out.println("the list is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("Null");
 }
 //function to delete the node at last position
 public void deleteLast(){
    if(head==null){
        System.out.println("The list is empty");
        return;
    }
    size--;//counter for nodes
    if(head.next==null){
        head=null;
        return;
    }
    Node secondLast=head;
    Node last=head.next;
    while(last.next!=null){
        last=last.next;
        secondLast=secondLast.next;
    }
    secondLast.next=null;
 }
 //deleting node form first position
 public void deletefirst(){
    if(head==null){
        System.out.println("The list is empty");
        return;
    }
    head=head.next;
    size--;//counter for nodes
 }
 public static void main(String[] args) {
    linkedList list= new linkedList();//creating object of the same class to call the function
   //adding node at the first
    list.addFirst("is");
    list.addFirst("list");
    list.addFirst("The");
    list.printList();//printing the list
    //adding node at the end of the list
    list.addLast("created.");
    list.addLast("(what next?)");
    list.printList();
    //deteling node from beginning of list
    list.deletefirst();
    list.printList();
    //deleting node from last of the list
    list.deleteLast();
    list.printList();

 }
    
}
