package Seminar4.Stack04;

public class MyStackMain04 {
    public static void main(String[] args) {
        MyStack04 myStack = new MyStack04();
        System.out.println(myStack.size());
        myStack.push(22);
        myStack.push(25);
        myStack.push(12);
//        myStack.push(100);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}
