import java.util.*;
public class Deques
{
public static void main(String[]args)
{
Deque<String>deque=new ArrayDeque<String>();
deque.add("A");
deque.add("B");
deque.add("C");
deque.add("D");
deque.add("E");
deque.add("F");
deque.add("G");
System.out.print("\nElements in deque:");
for(String str:deque)
{
System.out.print(str+" ");
}
deque.remove();
System.out.print("\n\nAfter First Element is Deleted :");
for(String str:deque){
System.out.print(str+" ");
}
deque.clear();
System.out.print("\n\nAfter all Elements deleted :");
for(String str:deque)
{
System.out.print(str+"");
}
}
}
