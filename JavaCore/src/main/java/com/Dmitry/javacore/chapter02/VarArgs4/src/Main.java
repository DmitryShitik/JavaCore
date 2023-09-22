public class Main {
    static void vaTest(int ... v) {
        System.out.print("vaTest(Integer ...): " +
                "Количество аргументов: " + v.length +
                " Содержимое: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...) " +
                "Количество аргументов: " + v.length +
                " Содержимое: ");

        for(boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }


    public static void main(String args[])
    {
        vaTest(1, 2, 3);  // OK
        vaTest(true, false, false); // OK

        //vaTest();  Ошибка: неоднозначность!
    }
}