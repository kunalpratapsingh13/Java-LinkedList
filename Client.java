import java.util.*;
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addFirst(40);
		ll.addAt(60,1);
		ll.display();
		int first = ll.removeFirst();
		System.out.println(first);
		ll.display();
		ll.reverseData();
		ll.display();
	}

}
