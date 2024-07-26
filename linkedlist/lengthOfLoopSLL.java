package linkedlist;
//program to find length of loop in the list
public class lengthOfLoopSLL {

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
    //function to find lengthof the loop in the list(tortoise and hare algo)
    int findLoopLength(Node head){
        Node fast=head;
        Node slow=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                int count=1;
                fast=fast.next;
                while(fast!=slow){
                    count++;
                    fast=fast.next;
                }
                return count;
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        lengthOfLoopSLL list= new lengthOfLoopSLL();
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
        //detecting the loop in the list  andfinding its length
        int ans=list.findLoopLength(head);
        if(ans==0){
            System.out.print("there is no loop");
        }
        else{
            System.out.println("the length of the loop is "+ ans);
        }
    }
}
