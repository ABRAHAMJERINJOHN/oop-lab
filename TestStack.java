import java.util.ArrayList;
//labcycle 4th program.....
class Stack <T> {
ArrayList<T> stck;
int tos;
int size;
// Initialize top-of-stack
Stack(int s) {
stck = new ArrayList<T>();
tos = -1;
size = s;
}
// Push an item onto the stack
void push(T item) {
if(tos==size-1)
System.out.println("Stack is full.");
else
stck.add(++tos,item);
}
// Pop an item from the stack
T pop() {
if(tos < 0) {
System.out.println("Stack underflow.");
return null;
}
else
return stck.get(tos--);
}


}

class TestStack {
public static void main(String args[]) {
Stack<Integer> mystack1 = new Stack<Integer>(4);
Stack<String> mystack2 = new Stack<String>(5);
mystack1.push(10);
mystack1.push(20);
mystack1.push(30);
mystack1.push(40);
mystack1.push(50);
mystack1.push(60);
mystack1.push(10);
mystack1.push(20);
mystack1.push(30);
mystack1.push(40);

mystack1.pop();
System.out.println(mystack1.pop());
System.out.println(mystack1.pop());
System.out.println(mystack1.pop());
mystack2.push("Hai");
mystack2.push("hellow");
mystack2.push("welcome");
mystack2.push("java");
System.out.println(mystack2.pop());
System.out.println(mystack2.pop());
System.out.println(mystack2.pop());

