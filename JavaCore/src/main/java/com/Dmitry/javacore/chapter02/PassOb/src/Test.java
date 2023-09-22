import java.util.Iterator;

public class Test {
    int a, b;

    public Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}
