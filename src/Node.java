
public class Node {
	private final Integer value;
	private Node next;

	public Node(Integer value) {
		this.value = value;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getValue() {
		return value;
	}
	public static void printLinkedList(Node head){
		while(head!=null){
			System.out.print(head.getValue());
			head=head.getNext();
		}
		System.out.println();
	}

}
