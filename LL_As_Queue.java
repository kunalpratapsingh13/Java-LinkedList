package LinkedList;

public class LL_As_Queue {
	private LinkedList queue;
	
	public LL_As_Queue() {
		this.queue = new LinkedList();
	}
	
	public int size() {
		return this.queue.size();
	}
	
	public boolean isEmpty() {
		return this.queue.isEmpty();
	}
	
	public void enqueue(int data ) {
		this.queue.addLast(data);
	}
	
	public int dequeue() throws Exception{
		return this.queue.removeLast();
	}
	
	public int front () throws Exception{
		return this.queue.getFirst();
	}
	
	public void display() throws Exception {
		this.queue.display();
	}
	
}
