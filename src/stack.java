import java.util.Stack;

public class stack{
    static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        //pushing data to the stack
        stack.push("COD MW 2022");
        stack.push("Battlefeild 6");
        stack.push("Battlefeild 6");
        stack.push("God Of War");
        stack.push("RDR 2");
        stack.push("GTA 6");
        System.out.println(stack.empty());
        System.out.println(stack);

        //remove data from the stack
        stack.pop();
        System.out.println(stack);

    }
}