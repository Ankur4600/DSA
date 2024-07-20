package linkedlist;
//LinkedList using collection framework
import java.util.LinkedList;
public class LL {
    public static void main(String[] args) {
        //creating linked list
        LinkedList<String> list=new LinkedList<String>();

        
        //function to add node at first of the list
        list.addFirst("way");
        list.addFirst("only");
        list.addFirst("The");
        System.out.println(list);


        //function to add node at the end of the list
        list.addLast("to do great work ");
        list.addLast("is to");
        list.add("love what you do");//in place of addLast we can also use add bioth are same
        System.out.println(list);


        //for size of the list
        System.out.println(list.size());


        //for printing list usiong loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");


        //deleting from beginning of the list
        list.removeFirst();
        System.out.println(list);


        //delete node form last of theb list
        list.removeLast();
        System.out.println(list);


        //deleting node from any index
        list.remove(3);

    
    }
    
}
