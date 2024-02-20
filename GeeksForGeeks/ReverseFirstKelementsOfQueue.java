package GeeksForGeeks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelementsOfQueue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		Queue<Integer> result = modifyQueue(q,q.size());
		System.out.println(result);
	}
	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
		Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }

        return q;
    }
}
