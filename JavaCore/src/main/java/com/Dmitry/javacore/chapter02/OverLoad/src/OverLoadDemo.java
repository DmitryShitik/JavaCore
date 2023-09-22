public class OverLoadDemo {
    void test() {
        System.out.println("Параметров нет");
    }

    void test(int a) {
        System.out.println("int а: " + a);
    }

    void test(int a, int b) {
        System.out.println("a: " + a + "b: " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
