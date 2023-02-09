import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

		public class B {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> s = new Stack<>();
		Queue<String> q = new LinkedList<>();

        // Pushing new items to the Stack
        s.push("pudding");
s.push("pie");
s.push("brownie");
q.add(s.pop());
q.add("ice-cream");
q.add(s.pop());
s.push("cake");
s.push(q.remove());
q.remove();
q.add(s.peek());
s.push("cookie");
s.push("fruit");
s.push(q.remove());
q.add(s.peek());
q.add(s.pop());


      

        // Get the item at the top of the stack without removing it
   
        System.out.println("Stack.peek() => " + s.peek());
       

    }
	}
