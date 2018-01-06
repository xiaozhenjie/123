import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public Node createLinkedList(List<Integer> data){
		if(data.isEmpty()){
			return null;
		}
		Node firstNode = new Node(data.get(0));
		firstNode.setNext(createLinkedList(data.subList(1, data.size())));
		return firstNode;
	}
	public Node reverseLinkedList(Node node){
		if(node==null){
			return null;
		}
		if(node.getNext()==null){
			return node;
		}
		Node newHead = reverseLinkedList(node.getNext());
		node.getNext().setNext(node);
		node.setNext(null);
		return newHead;
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		Node.printLinkedList(t.createLinkedList(Arrays.asList()));
		Node.printLinkedList(t.createLinkedList(Arrays.asList(1)));
		Node.printLinkedList(t.createLinkedList(Arrays.asList(1,2,3,4,5)));
		Node node = t.createLinkedList(Arrays.asList(1,2,3,4,5));
		t.reverseLinkedList(node);
	}

}
