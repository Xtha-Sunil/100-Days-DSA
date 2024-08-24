public class LL {
		
		private Node head;
		
		
		// insert at first
		public void addFirst(String value){
				Node node = new Node(value);
				head.next = node;
				head = node;
		}
		
		public void display(){
				Node temp = head;
				if (head == null){
						System.out.println("LL is empty;");
						return;
				}
				
				while(temp.next != null){
						System.out.println(temp.value + "->");
				}
				System.out.println("NULL");
		}
		
		
		
		
		
		class Node{
				Node next;
				String value;
				
				public Node() {}
				
				public Node(String value){
						this.value = value;
				}
				
				public Node(String value, Node next){
						this.value = value;
						this.next = next;
				}
		}
}