public class Main {
    public static void main(String[] args) {
        Stack myS1=new Stack();
        Stack myS2=new Stack();

        for (int i = 0; i < 10; i++) {
            myS1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myS2.push(i);
        }

        System.out.println("Содержимое стека 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(myS1.pop());
        }
        System.out.println("Содержимое стека 2");
        for (int i = 0; i < 10; i++) {
            System.out.println(myS2.pop());
        }
    }
}