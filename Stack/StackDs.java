package Stack;

public class StackDs {
	private  Object[] stackarray;
	private static int size;
	private int top;
	public StackDs(int size) {
		this.size=size;
		this.top=-1;
		stackarray = new Object[size];
	}
	public void push(Object i) {
		if(top==size-1) {
			System.out.println("Stack Overflow");
		}
		else {
			top++;
			stackarray[top]=i;
		}
	}
	public Object pop() {
		if(top==-1)System.out.println("Stack Underflow");
		else {
			return stackarray[top--];
		}return null;
	}
	public Object peek() {
		return stackarray[top];
	}
	public static void main(String[] args) {
		StackDs s = new StackDs(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		for(int i=0;i<s.top+1;i++)
			System.out.println(s.stackarray[i]);
	}
}
