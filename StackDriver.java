import java.util.*;

public class StackDriver{
    //initializing the stack array
    int[] stack = new int[5];
    //initializing the variable top to -1
    int top = -1;

    public static void main(String[] args){
        //System.out.println("Hello testing");
    }

    //push method
    public void push(){
        int data;//declare the variable x to store inputted data
        System.out.print("Enter the num ["+(top+1)+"]");
        Scanner input = new Scanner(System.in);//creating a scanner object from importing scanner class
        data = input.nextInt();//getting values from user to the data variable

        if (top==stack.length-1) {
            System.out.println("Stack is over flow!!!");
        } else {
            top++;
            stack[top] = data;
        }

    }

    //pop method
    public void pop(){
        if (top == -1) {
            System.out.println("Stack is underflow!!!");
        } else {
            top--;
        }
    }

    //isEmpty method
    public boolean isEmpty(){
        if (top<0) {
            return true;
        } else {
            return false;
        }
    }

    //isFull method
    public boolean isFull(){
        if (top==stack.length-1) {
            return true;
        } else {
            return false;
        }
    }

    //peek method
    public void peek(){
        System.out.println("Stack's top value is: "+stack[top]);
    }

    
}