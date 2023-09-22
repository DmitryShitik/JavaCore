package p2;

public class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("из другого конструктора");

        //  переменная с модификатором пол умолчанию
        //  System.out.println("n = " + p.n);

        //  переменная с модификатором private
        //  System.out.println("n_pri = " + p.n_pri);

        //  переменная с модификатором protected
        //  System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
