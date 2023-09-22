public class OverloadDemo {
    void test() {
        System.out.println("Нет параметров");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутри теста (double) a: " + a);
    }
}
