import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("бета");
        lhs.add("альфа");
        lhs.add("эта");
        lhs.add("гамма");
        lhs.add("эпсилон");
        lhs.add("омега");
        System.out.println(lhs);
    }
}