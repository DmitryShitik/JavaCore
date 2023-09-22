public class Main {
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length +
                " Содержимое: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        vaTest("Один параметр: ", 10);
        vaTest("Tpи параметр: ", 1, 2, 3);
        vaTest("Бeз параметров: ");
    }
}