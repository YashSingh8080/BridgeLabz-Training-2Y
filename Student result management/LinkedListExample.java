
import java.util.LinkedList;

public class LinkedListExample{
  public static void main(String[] args) {
      LinkedList<String> queue = new LinkedList<>();
      queue.add("Yash");
      queue.add("Aditya");
      queue.add("Ishaan");
      System.out.println("Initial Queue: "+queue);
      queue.removeFirst();
      System.out.println("After removing first: "+ queue);
      queue.addLast("Nobita");
      System.out.println("After adding list: "+ queue);

  }
}