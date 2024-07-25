package linkedlist;

public class sort0_1_2LL {
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
    Node sortLL(Node head){
        if(head==null || head.next==null)return head;
        Node zerohead =new Node(-1);
        Node onehead= new Node(-1);
        Node twohead =new Node(-1);
        Node zero=zerohead;
        Node one=onehead;
        Node two=twohead;
        Node tmp=head;
        Node newhead;
        while(tmp!=null){
            if(tmp.data==0){
                zero.next=tmp;
               
                zero=zero.next;
                // System.out.print(zero.data);
                
            }
            else if(tmp.data==1){
                one.next=tmp;
                one=one.next;
            }
            else{
                two.next=tmp;
                two=two.next;
            }
            tmp=tmp.next;
           
        }
        System.out.println();
        Node tmp1=zerohead.next;
        while(tmp1!=null){
            System.out.println(tmp1.data);
            tmp1=tmp1.next;
        }
       
        // if(zero!=null){
        //     if(one!=null){
        //         zero.next=onehead.next;
        //         one.next=twohead.next;
        //     }
        //     else{
        //         zero.next=twohead.next;
        //     }
        //     newhead=zerohead.next;
        //     return newhead;
        // }
        // if(one!=null){
        //     head=onehead.next;
        //     one.next=twohead.next;
        //     return head;
        // }
        return head;
    }
    public static void main(String[] args) {
        sort0_1_2LL list=new sort0_1_2LL();
        Node head=null;
        head=list.addInList(head, 1);
        head=list.addInList(head, 0);
        head=list.addInList(head, 1);
        head=list.addInList(head, 2);
        head=list.addInList(head, 0);
        head=list.addInList(head, 2);
        head=list.addInList(head, 1);
        list.printList(head);
        head=list.sortLL(head);
        list.printList(head);
       
    }
}
