import java.util.*;
public class Stack {
    private Vector<String> student = new Vector<>();
    private int top;
    private int maxsize;

    private String fname;
    private String lname;
    private double GPA;
    private int sid;

    public Stack(int size) {
        maxsize = size;
        top = -1;
    }

    public void push(String fname,String lname,double GPA,int sid) {
        if(top == maxsize - 1){
             System.out.println("Stack overflow");
             return;
        }
        top++;
        String element = "First name : "+fname+" Last name : "+lname+" GPA : "+GPA+" Student ID : "+sid;
        student.addElement(element);
        System.out.println(element+" is pushed to the stack");
    }

    public String pop() {
        if(top==-1){
            System.out.println("Stack underflow");
            return "-1";
        }
        String element = student.get(top);
        student.remove(top);
        top--;
        return element;
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return "-1";
        }
        return student.get(top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }

    public int size(){return top+1;}
 

    public static void main(String[] args) {
        Stack stack = new Stack(7);

        stack.push("vidchayada", "abhicharttibutra", 1.7, 672115044);
        System.out.println(stack.pop()+" is poped from the stack");
        stack.push("chanchakorn", "Chulapech", 4.0, 672115007);
        System.out.println(stack.pop()+" is poped from the stack");
        stack.push("John", "Doe", 2.0, 67213365);
        System.out.println(stack.pop()+" is poped from the stack");
        stack.push("Jimmy", "Doeson", 4.0, 672115005);
        System.out.println(stack.pop()+" is poped from the stack");
        stack.push("Lulu", "lala", 3.5, 672115069);
        System.out.println(stack.pop()+" is poped from the stack");
        stack.push("Nany", "Tom", 3.0, 67213398);
        System.out.println(stack.pop()+" is poped from the stack");
        stack.push("Susan", "Dep", 4.0, 672115035);
        System.out.println(stack.pop()+" is poped from the stack");

        System.out.println(" There is "+stack.size()+" element left in the stack");
}
}

