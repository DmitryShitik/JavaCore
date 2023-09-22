public class Quter {
    int quterX = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println(quterX);
                }
            }
            Inner inner =new Inner();
            inner.display();
        }
    }
}
