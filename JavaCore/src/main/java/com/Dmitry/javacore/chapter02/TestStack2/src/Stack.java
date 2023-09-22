public class Stack {
    private int[] stack;
    private int tos;

    public Stack(int size) {
        stack=new int[size];
        tos =-1;
    }
    void push(int item){
        if(tos==stack.length-1)
            System.out.println("Стек заполнен");
        else stack[++tos]=item;
    }
    int pop(){
        if (tos<0){
            System.out.println("Стек не заполнен");
            return 0;
        }
        else
            return stack[tos--];
    }
}
