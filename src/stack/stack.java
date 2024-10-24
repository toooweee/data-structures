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

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        for(int i = 0; i < 10000000; i++) {
            stack.push("Fallout 76");
        }
    }
}
