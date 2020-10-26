package lafenglong;

import java.util.Stack;

public class ValidateStackSequences {

    public static void main(String[] args) {
        int[]pushed = new int[] {1,2,3,4,5};
        int[]popped = new int[]{4,5,3,2,1};
        ValidateStackSequences validateStackSequences = new ValidateStackSequences();
        boolean b = validateStackSequences.validateStackSequences(pushed, popped);
    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        //记录pushed的入栈的位置
        int i = 0;
        //记录pop的出栈位置
        int j = 0;
        while(true)
        {
            if(i < pushed.length)
            {
                stack.push(pushed[i]);
                i++;
            }
            //每次push之后，都查看一下，如果栈顶的元素和poped当前的元素是意义的，则出栈
            while(stack.peek() == popped[j])
            {
                stack.pop();
                j++;
            }
            if(i == pushed.length && stack.empty())
            {
                return true;
            }
            //已经全部进栈
            if(i == pushed.length && !stack.empty())
            {
                return false;
            }

        }


    }
}
