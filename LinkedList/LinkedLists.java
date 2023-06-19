import java.util.*;
class LinkedLists
{
public static void main(String[]args)
{
//Create a linked list object.
LinkedList<String> ll=new LinkedList<String>();
//Add elements to the linked list
ll.add("apple");
ll.add("banana");
ll.add("carrot");
ll.add("dove");
ll.add("elephant");
ll.add("flower");
System.out.println("Current contents of linked list :"+ll);
ll.clear();
System.out.println("Contents of linked list after deletion :"+ll);
}
}
