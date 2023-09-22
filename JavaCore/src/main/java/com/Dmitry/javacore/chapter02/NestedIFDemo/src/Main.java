public class Main {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("не отрицательное");
        if(nif.isNotNegative(-12))
            System.out.println("не выведет");
    }
}