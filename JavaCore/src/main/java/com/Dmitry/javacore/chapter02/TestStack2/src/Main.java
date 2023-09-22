import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Stack myS1 = new Stack(5);
        Stack myS2 = new Stack(8);

        for (int i = 0; i < 5; i++)myS1.push(i);
        for (int i = 0; i < 5; i++)myS2.push(i);

        System.out.println("Стек в myS1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(myS1.pop());

        System.out.println("Стек в myS2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(myS2.pop());
    }
}