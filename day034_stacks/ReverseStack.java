import java.util.Stack;
public class ReverseStack {
		public static void pushAtButtom(int data, Stack<Integer> s){
				if(s.isEmpty()){
						s.push(data);
						return;
				}
				int top = s.pop();
				pushAtButtom(data, s);
				s.push(top);
		}
		
		public static void reverse(Stack<Integer> s){
				if(s.isEmpty()){
						return;
				}
				int top = s.pop();
				reverse(s);
				pushAtButtom(top, s);
		}
		
		public static void main(String[] args) {
				Stack<Integer> s = new Stack<>();
				s.push(4);
				s.push(3);
				s.push(2);
				s.push(1);
				
				reverse(s);
				while(!s.isEmpty()){
						System.out.println(s.pop());
				}
		}
}