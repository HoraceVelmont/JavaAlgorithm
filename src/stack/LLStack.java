package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class LLStack extends Stack {
	private LLNode headNode;

	public LLStack() {
		this.headNode = new LLNode(null);
	}

	public void Push(int data) {
		if (headNode == null) {
			headNode = new LLNode(data);
		} else if (headNode.getData() == null) {
			headNode.setData(data);
		} else {
			LLNode llNode = new LLNode(data);
			llNode.setNext(headNode);
			headNode = llNode;
		}
	}

	public int top() {
		if (headNode == null)
			return null;
		else
			return headNode.getData();
	}

	public int pop() {
		if (headNode == null) {
			throw new EmptyStackException("Stack empty");
		} else {
			int data = headNode.getData();
			headNode = headNode.getNext();
			return data;
		}
	}

	public boolean isEmpty() {
		if (headNode == null) {
			return true;
		} else {
			return false;
		}
	}

	public void deleteStack() {
		headNode = null;
	}
}
