import java.util.*;

public class StackDriver{
    //initializing the stack array
    static int[] stack = new int[5];
    //initializing the variable top to -1
    static int top = -1;
    public static void main(String[] args){
        int num = 1;
        while (num != 0) {
            Scanner ch = new Scanner(System.in);
            System.out.println("Enter the numbers accroding to your operation:\n1 : push\n2 : pop\n3 : isFull\n4 : isEmpty\n5 : peek\n6 : display");
            num = ch.nextInt();
            switch (num) {
                case 0:
                    break;
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    isFull();
                    break;
                case 4:
                    isEmpty();
                    break;
                case 5:
                    peek();
                    break;
                case 6:
                    display();
                    break;
                default:
                    System.out.println("Invalid num or characater!!!");
            }    
        }
    }

    //push method
    public static void push(){
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
    public static void pop(){
        if (top == -1) {
            System.out.println("Stack is underflow!!!");
        } else {
            top--;
        }
    }

    //isEmpty method
    public static void isEmpty(){
        if (top<0) {
            System.out.println("Stack is Empty!!!");
        } else {
            System.out.println("Stack is not Empty!!!");
        }
    }

    //isFull method
    public static void isFull(){
        if (top==stack.length-1) {
            System.out.println("Stack is full!!!");
        } else {
            System.out.println("Stack is not full!!!");
        }
    }

    //peek method
    public static void peek(){
        if (top>=0) {
            System.out.println("Stack's top value is: "+stack[top]);
        }
        else{
            System.out.println("Stack is empty");
        }
    }

    //display method
    public static void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println("Stack["+i+"] = "+stack[top]);
        }
    }
}