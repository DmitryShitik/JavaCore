public class Main {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        System.out.println(ob.a+" "+ob.b);

        ob.math(ob);

        System.out.println(ob.a+" "+ob.b);
    }
}