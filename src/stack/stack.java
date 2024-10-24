package stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        /*
         * stack = LIFO data structure. Last-In First-Out
         *         stores objects into a sort of "vertical tower"
         *         push() to add to the top
         *         pop() to remove from the top
         */

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        String firstGame = stack.peek();
        System.out.println(firstGame);

        System.out.println(stack);
    }
}
